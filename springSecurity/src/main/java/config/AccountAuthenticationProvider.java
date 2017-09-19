package config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import service.AccountDetailsHandler;

import javax.annotation.Resource;

/**
 * Created by lizhupeng on 2017/9/18.
 */
@Component
public class AccountAuthenticationProvider
        extends AbstractUserDetailsAuthenticationProvider {

    @Resource
    AccountDetailsHandler accountDetailsHandler;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        UserDetails userDetails = accountDetailsHandler.loadUserByUsername(username);

        return userDetails;
    }
}
