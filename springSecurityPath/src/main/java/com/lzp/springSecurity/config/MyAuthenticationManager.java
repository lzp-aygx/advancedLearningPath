package com.lzp.springSecurity.config;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhupeng on 2017/9/21.
 */
@Component
public class MyAuthenticationManager implements AuthenticationManager {

    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {
        System.out.println("Code: " + auth.getName() + "Authoritise: " + auth.getAuthorities() + "Credentials: " + auth.getCredentials());
        List<GrantedAuthority> AUTHORITIES1 = new ArrayList<GrantedAuthority>();
        List<GrantedAuthority> AUTHORITIES2 = new ArrayList<GrantedAuthority>();
        AUTHORITIES1.add(new SimpleGrantedAuthority("ROLE_USER"));
        AUTHORITIES2.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//        判断用户和授权密码相等就为用户生成安全授权上下文
        if ("1".equals(auth.getName())) {
            return new UsernamePasswordAuthenticationToken(auth.getName(),
                    auth.getCredentials(), AUTHORITIES1);
        } else if ("2".equals(auth.getName())) {
            return new UsernamePasswordAuthenticationToken(auth.getName(),
                    auth.getCredentials(), AUTHORITIES2);
        } else {
            throw new BadCredentialsException("Bad Credentials");
        }
    }
}
