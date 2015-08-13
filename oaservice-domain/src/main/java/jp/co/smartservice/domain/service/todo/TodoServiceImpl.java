package jp.co.smartservice.domain.service.todo;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import jp.co.smartservice.domain.model.T900Todo;
import jp.co.smartservice.domain.model.T900TodoExample;
import jp.co.smartservice.domain.model.T900TodoKey;
import jp.co.smartservice.domain.repository.T900TodoMapper;

@Service
public class TodoServiceImpl implements TodoService {

	private static final long MAX_UNFINISHED_COUNT = 5;

	@Inject
	JodaTimeDateFactory dateFactory;

	@Inject
	T900TodoMapper t900TodoMapper;

	@Override
	public Collection<T900Todo> findAll() {
		T900TodoExample example = new T900TodoExample();
		return t900TodoMapper.selectByExample(example);
	}

	@Override
	public T900Todo create(T900Todo T900Todo) {

		T900TodoExample example = new T900TodoExample();
		example.createCriteria().andFinishedEqualTo(false);
		long unfinishedCount = t900TodoMapper.countByExample(example);

		if (unfinishedCount >= MAX_UNFINISHED_COUNT) {
			ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage
                    .fromText("[E001] The count of un-finished T900Todo must not be over "
                            + MAX_UNFINISHED_COUNT + "."));
            throw new BusinessException(messages);
		}

		String todoId = UUID.randomUUID().toString();

		Date createdAt = dateFactory.newDate();
		T900Todo.setTodoId(todoId);
		T900Todo.setCreatedAt(createdAt);
		T900Todo.setFinished(false);

		t900TodoMapper.insert(T900Todo);

		return T900Todo;
	}

	@Override
	public T900Todo finish(String todoId) {
		T900Todo T900Todo = findOne(todoId);
		if (T900Todo.getFinished()) {
			ResultMessages messages = ResultMessages.error();
			messages.add(ResultMessage
                    .fromText("[E002] The requested T900Todo is already finished. (id=" + todoId + ")"));
            throw new BusinessException(messages);
		}

		T900Todo.setFinished(true);
		t900TodoMapper.updateByPrimaryKey(T900Todo);

		return T900Todo;
	}

	@Override
	public void delete(String todoId) {
		T900Todo T900Todo = findOne(todoId);
		t900TodoMapper.deleteByPrimaryKey(T900Todo);
	}

	@Override
	public T900Todo findOne(String todoId) {
		T900TodoKey T900TodoKey = new T900TodoKey();
		T900TodoKey.setTodoId(todoId);
		T900Todo T900Todo = t900TodoMapper.selectByPrimaryKey(T900TodoKey);
		if (T900Todo == null) {
			ResultMessages messages = ResultMessages.error();
			messages.add(ResultMessage.fromText("[E404] The requested T900Todo is not found. (id=" + todoId + ")"));
			throw new BusinessException(messages);
		}
		return T900Todo;
	}

	@Override
	public Page<T900Todo> findPage(T900TodoExample example, Pageable pageable) {
		long total = t900TodoMapper.countByExample(example);
		List<T900Todo> todoList = null;

		if (0 < total) {
			RowBounds rowBounds = new RowBounds(pageable.getOffset(), pageable.getPageSize());
			todoList = t900TodoMapper.findPageByExample(example, rowBounds);
		} else {
			todoList = Collections.emptyList();
		}
		return new PageImpl<T900Todo>(todoList, pageable, total);
	}

}
