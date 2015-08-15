package jp.co.smartservice.domain.service.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import jp.co.smartservice.domain.model.T001User;
import jp.co.smartservice.domain.model.T001UserExample;

public interface UserSharedService {

    T001User findUser(String userId);

    Page<T001User> findPage(T001UserExample example, Pageable pageable);

    T001User register(T001User t001User);

    T001User update(T001User t001User);
}
