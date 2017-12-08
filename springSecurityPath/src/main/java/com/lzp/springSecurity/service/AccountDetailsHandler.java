package com.lzp.springSecurity.service;

import com.lzp.springSecurity.mapper.UserInfoMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by lizhupeng on 2017/9/18.
 */
@Service
public class AccountDetailsHandler implements UserDetailsService {

    private UserInfoMapper userInfoMapper;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();

        com.lzp.springSecurity.domain.User user = userInfoMapper.getUserInfoById(id);

        if ("1".equals(id)) {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        } else {
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        }

        User userDetails = new User(user.getName(),
                user.getPassword(), false,
                false, false,
                false, grantedAuthorities);
        return userDetails;
    }
}
