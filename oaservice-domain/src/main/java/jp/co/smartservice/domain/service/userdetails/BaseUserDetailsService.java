/*
 * Copyright (C) 2013-2015 Smart Service
 *
 */
package jp.co.smartservice.domain.service.userdetails;

import java.util.Collections;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.co.smartservice.domain.common.constants.DmnConstants;
import jp.co.smartservice.domain.model.User;
import jp.co.smartservice.domain.service.userinfo.UserSharedService;

public class BaseUserDetailsService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(BaseUserDetailsService.class);

    @Inject
    UserSharedService userSharedService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.debug("Execute Method loadUserByUsername.");

        User userInfo = userSharedService.findUser(username);
        if (userInfo == null) {
            throw new UsernameNotFoundException(username + " is not found."); // TODO to property file
        }

        String userRole = userInfo.getUserRole();

        if (!DmnConstants.ROLE_USER.equals(userRole) && !DmnConstants.ROLE_ADMIN.equals(userRole)) {
            logger.error("user role: " + userRole + " is not permitted");
            throw new AuthenticationServiceException("user role: " + userRole + " is not permitted");
        }

        BaseUserDetails userDetails = new BaseUserDetails(userInfo, Collections
                .singletonList(new SimpleGrantedAuthority(userRole)));

        return userDetails;
    }

}
