package jp.co.smartservice.domain.service.userinfo;

import jp.co.smartservice.domain.model.T001User;

public interface UserSharedService {

    T001User findUserInfo(String userId);
}
