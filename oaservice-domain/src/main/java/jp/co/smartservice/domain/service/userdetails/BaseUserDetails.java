/*
 * Copyright (C) 2013-2015 Smart Service
 *
 */
package jp.co.smartservice.domain.service.userdetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import jp.co.smartservice.domain.model.User;

public class BaseUserDetails extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;

    private final User user;

    /**
     * Calls the more complex constructor with all boolean arguments set to {@code true}.
     */
    public BaseUserDetails(User user, Collection<? extends GrantedAuthority> authorities) {

        super(user.getUsername(), user.getPassword(), authorities);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }
}
