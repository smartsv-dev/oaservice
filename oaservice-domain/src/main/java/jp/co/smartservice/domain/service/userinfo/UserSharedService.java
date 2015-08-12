package jp.co.smartservice.domain.service.userinfo;

import jp.co.smartservice.domain.model.User;

public interface UserSharedService {

    User findUser(String username);
}
