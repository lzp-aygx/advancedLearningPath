package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;

/**
 * Created by lizhupeng on 2017/7/28.
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    AccountAuthenticationProvider accountAuthenticationProvider;


    @Resource
    public void configureGlobal(AuthenticationManagerBuilder auth){
        auth.authenticationProvider(accountAuthenticationProvider);
    }


    protected void configure(HttpSecurity http) throws Exception {
        //屏蔽防跨域请求.
        http.csrf().disable();
        http.sessionManagement().disable();

//        http.authorizeRequests()
//                .antMatchers("/", "/login").permitAll()//配置根路径和/login路径为不拦截路径
//                .antMatchers("/admin/**").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and().formLogin().loginPage("/login").failureUrl("/401.html").defaultSuccessUrl("/index").permitAll()//配置登录页面
//                .and().logout().permitAll();//配置注销登出页面
    }

    //在内存中分别配置两个用户,角色是USER
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("lzp").password("lzp").roles("USER")
                .and()
                .withUser("lizhupeng").password("lizhupeng").roles("USER");
    }

    //忽略静态资源的拦截
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/resources/static/**");
    }
}
