package com.lzp.springSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * Created by lizhupeng on 2017/7/28.
 */
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启Security的方法注解
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    @Resource
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("password")
                .roles("ADMIN");
//        auth.authenticationProvider(accountAuthenticationProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/api/**").permitAll()
//                .mvcMatchers("/api/user").hasRole("USER")
//                .mvcMatchers("/api/admin").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").failureUrl("/login-error").permitAll()
//                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().csrf().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }

    @Bean
    public AuthenticationProvider authenticationProvider(){
        AuthenticationProvider authenticationProvider=new MyAuthenticationProvider();
        return authenticationProvider;
    }

}
