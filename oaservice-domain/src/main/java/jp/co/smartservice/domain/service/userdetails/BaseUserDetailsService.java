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

import jp.co.smartservice.domain.common.constants.Constants;
import jp.co.smartservice.domain.model.T001User;
import jp.co.smartservice.domain.service.user.UserSharedService;

public class BaseUserDetailsService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(BaseUserDetailsService.class);

    @Inject
    UserSharedService userSharedService;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {

        logger.debug("Execute Method loadUserByUsername.");

        T001User userInfo = userSharedService.findUser(userId);
        if (userInfo == null) {
            throw new UsernameNotFoundException(userId + " is not found."); // TODO to property file
        }

        String userRole = userInfo.getUserRole();
        String userRoleStr = null;

        if (!Constants.ROLE_USER.equals(userRole) && !Constants.ROLE_ADMIN.equals(userRole)) {
            logger.error("user role: " + userRole + " is not permitted");
            throw new AuthenticationServiceException("user role: " + userRole + " is not permitted");
        }

        if (Constants.ROLE_USER.equals(userRole)) {
        	userRoleStr = Constants.ROLE_USER_STR;
        } else if (Constants.ROLE_ADMIN.equals(userRole)) {
        	userRoleStr = Constants.ROLE_ADMIN_STR;
        }

        BaseUserDetails userDetails = new BaseUserDetails(userInfo, Collections
                .singletonList(new SimpleGrantedAuthority(userRoleStr)));

        return userDetails;
    }

}
