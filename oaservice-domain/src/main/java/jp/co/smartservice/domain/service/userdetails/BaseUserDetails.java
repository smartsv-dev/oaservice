/*
 * Copyright (C) 2013-2015 Smart Service
 *
 */
package jp.co.smartservice.domain.service.userdetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.smartservice.domain.model.T001User;

public class BaseUserDetails extends User {

    private static final long serialVersionUID = 1L;

    private final T001User userInfo;

    /**
     * Calls the more complex constructor with all boolean arguments set to {@code true}.
     */
    public BaseUserDetails(T001User userInfo, Collection<? extends GrantedAuthority> authorities) {

        super(userInfo.getUserId(), userInfo.getPassword(), authorities);
        this.userInfo = userInfo;
    }

    public T001User getUserInfo() {
        return this.userInfo;
    }
}
