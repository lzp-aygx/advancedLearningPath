package service;

import domain.Account;
import domain.Role;
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


    //    注入Mapper
    private Account account;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (Role role : account.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getCode()));
        }

        User userDetails = new User(account.getEmployeeId(),
                account.getPassWord(), account.isEnable(),
                account.isExpired(), account.isCredentialsExpired(),
                account.isLocked(), grantedAuthorities);
        return userDetails;
    }
}
