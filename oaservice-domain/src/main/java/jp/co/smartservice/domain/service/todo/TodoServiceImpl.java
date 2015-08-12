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

import jp.co.smartservice.domain.model.Todo;
import jp.co.smartservice.domain.model.TodoExample;
import jp.co.smartservice.domain.model.TodoKey;
import jp.co.smartservice.domain.repository.TodoMapper;

@Service
public class TodoServiceImpl implements TodoService {

	private static final long MAX_UNFINISHED_COUNT = 5;

	@Inject
	JodaTimeDateFactory dateFactory;

	@Inject
	TodoMapper todoMapper;

	@Override
	public Collection<Todo> findAll() {
		TodoExample example = new TodoExample();
		return todoMapper.selectByExample(example);
	}

	@Override
	public Todo create(Todo todo) {

		TodoExample example = new TodoExample();
		example.createCriteria().andFinishedEqualTo(false);
		long unfinishedCount = todoMapper.countByExample(example);

		if (unfinishedCount >= MAX_UNFINISHED_COUNT) {
			ResultMessages messages = ResultMessages.error();
            messages.add(ResultMessage
                    .fromText("[E001] The count of un-finished Todo must not be over "
                            + MAX_UNFINISHED_COUNT + "."));
            throw new BusinessException(messages);
		}

		String todoId = UUID.randomUUID().toString();

		Date createdAt = dateFactory.newDate();
		todo.setTodoId(todoId);
		todo.setCreatedAt(createdAt);
		todo.setFinished(false);

		todoMapper.insert(todo);

		return todo;
	}

	@Override
	public Todo finish(String todoId) {
		Todo todo = findOne(todoId);
		if (todo.getFinished()) {
			ResultMessages messages = ResultMessages.error();
			messages.add(ResultMessage
                    .fromText("[E002] The requested Todo is already finished. (id=" + todoId + ")"));
            throw new BusinessException(messages);
		}

		todo.setFinished(true);
		todoMapper.updateByPrimaryKey(todo);

		return todo;
	}

	@Override
	public void delete(String todoId) {
		Todo todo = findOne(todoId);
		todoMapper.deleteByPrimaryKey(todo);
	}

	@Override
	public Todo findOne(String todoId) {
		TodoKey todoKey = new TodoKey();
		todoKey.setTodoId(todoId);
		Todo todo = todoMapper.selectByPrimaryKey(todoKey);
		if (todo == null) {
			ResultMessages messages = ResultMessages.error();
			messages.add(ResultMessage.fromText("[E404] The requested Todo is not found. (id=" + todoId + ")"));
			throw new BusinessException(messages);
		}
		return todo;
	}

	@Override
	public Page<Todo> findPage(TodoExample example, Pageable pageable) {
		long total = todoMapper.countByExample(example);
		List<Todo> todoList = null;

		if (0 < total) {
			RowBounds rowBounds = new RowBounds(pageable.getOffset(), pageable.getPageSize());
			todoList = todoMapper.findPageByExample(example, rowBounds);
		} else {
			todoList = Collections.emptyList();
		}
		return new PageImpl<Todo>(todoList, pageable, total);
	}

}
