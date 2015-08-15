package jp.co.smartservice.domain.service.user;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.sequencer.Sequencer;

import jp.co.smartservice.domain.common.constants.Constants;
import jp.co.smartservice.domain.common.utils.PropertyHelper;
import jp.co.smartservice.domain.model.T001User;
import jp.co.smartservice.domain.model.T001UserExample;
import jp.co.smartservice.domain.model.T001UserKey;
import jp.co.smartservice.domain.repository.T001UserMapper;

@Service
public class UserSharedServiceImpl implements UserSharedService {

	@Inject
	PasswordEncoder passwordEncoder;

	@Inject
	JodaTimeDateFactory dateFactory;

	@Inject
	@Named("userIdSequencer")
	Sequencer<String> userIdSequencer;

	@Inject
	PropertyHelper propertyHelper;

	@Inject
	T001UserMapper t001UserMapper;

	@Override
	public T001User findUser(String userId) {

		T001UserKey userKey = new T001UserKey();
		userKey.setUserId(userId);
		T001User user = t001UserMapper.selectByPrimaryKey(userKey);

		if (user == null) {
			throw new BusinessException("user not found!");
		}
		return user;
	}

	public Page<T001User> findPage(T001UserExample example, Pageable pageable) {

		List<T001User> userList = null;

		long total = t001UserMapper.countByExample(example);
		if (0 < total) {
			RowBounds rowBounds = new RowBounds(pageable.getOffset(), pageable.getPageSize());
			userList = t001UserMapper.selectPageByExample(example, rowBounds);
		} else {
			userList = Collections.emptyList();
		}
		return new PageImpl<T001User>(userList, pageable, total);
	}

	public T001User register(T001User user) {

		String userId = userIdSequencer.getNext();
	    String password = passwordEncoder.encode(propertyHelper.getInitPassword());
	    user.setUserId(userId);
	    user.setPassword(password);
	    user.setJobStat(Constants.JOB_STAT_JOINED);
	    user.setUserRole(Constants.ROLE_USER);
	    user.setDelFlg(Constants.DEL_FLG_0);
	    user.setUpdateDate(dateFactory.newDate());
	    user.setInsertDate(dateFactory.newDate());
	    t001UserMapper.insert(user);

	    return user;
	}

	public boolean matches(T001User user, String rawPassword) {
	    return passwordEncoder.matches(rawPassword, user.getPassword()); // (3)
	}

	@Override
	public T001User update(T001User t001User) {

		t001UserMapper.updateByPrimaryKey(t001User);
		// TODO 自動生成されたメソッド・スタブ
		return t001User;
	}

}
