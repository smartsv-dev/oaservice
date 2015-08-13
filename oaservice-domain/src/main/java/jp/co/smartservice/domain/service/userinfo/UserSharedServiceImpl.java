package jp.co.smartservice.domain.service.userinfo;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.exception.BusinessException;

import jp.co.smartservice.domain.model.T001User;
import jp.co.smartservice.domain.model.T001UserKey;
import jp.co.smartservice.domain.repository.T001UserMapper;

@Service
public class UserSharedServiceImpl implements UserSharedService {

	@Inject
	PasswordEncoder passwordEncoder;

	@Inject
	T001UserMapper userMapper;

	@Override
	public T001User findUserInfo(String userId) {

		T001UserKey userKey = new T001UserKey();
		userKey.setUserId(userId);
		T001User user = userMapper.selectByPrimaryKey(userKey);

		if (user == null) {
			throw new BusinessException("user not found!");
		}
		return user;
	}

	public String register(T001User user, String rawPassword) {
	    // omitted
	    // Password Hashing
	    String password = passwordEncoder.encode(rawPassword); // (2)
	    user.setPassword(password);
	    // omitted
	    return null;
	}

	public boolean matches(T001User user, String rawPassword) {
	    return passwordEncoder.matches(rawPassword, user.getPassword()); // (3)
	}

}
