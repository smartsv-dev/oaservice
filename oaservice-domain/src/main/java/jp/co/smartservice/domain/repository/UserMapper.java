/*
 * Copyright (C) 2013-2015 Smart Service
 *
 */
package jp.co.smartservice.domain.repository;

import jp.co.smartservice.domain.model.User;

public interface UserMapper {

    public abstract User findUserById(String userId);
}
