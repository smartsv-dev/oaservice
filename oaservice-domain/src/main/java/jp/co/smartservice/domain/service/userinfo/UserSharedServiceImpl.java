package jp.co.smartservice.domain.service.userinfo;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.terasoluna.gfw.common.exception.BusinessException;

import jp.co.smartservice.domain.model.User;
import jp.co.smartservice.domain.repository.UserMapper;

@Service
public class UserSharedServiceImpl implements UserSharedService {

	@Inject
	PasswordEncoder passwordEncoder;

	@Inject
	UserMapper userMapper;

	@Override
	public User findUser(String username) {

		User user = userMapper.findUserById(username);

		if (user == null) {
			throw new BusinessException("user not found!");
		}
		return user;
	}

	public String register(User user, String rawPassword) {
	    // omitted
	    // Password Hashing
	    String password = passwordEncoder.encode(rawPassword); // (2)
	    user.setPassword(password);
	    // omitted
	    return null;
	}

	public boolean matches(User user, String rawPassword) {
	    return passwordEncoder.matches(rawPassword, user.getPassword()); // (3)
	}

}
