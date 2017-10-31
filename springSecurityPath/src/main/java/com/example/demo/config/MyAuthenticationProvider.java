package com.example.demo.config;

import com.example.demo.service.AccountDetailsHandler;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import javax.annotation.Resource;

/**
 * Created by lizhupeng on 2017/9/18.
 */
//@Component
public class MyAuthenticationProvider
        implements AuthenticationProvider {

    @Resource
    AccountDetailsHandler accountDetailsHandler;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
