package study.springMVC;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by lizhupeng on 2017/3/7.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //配置登录和登出设置.为具体的请求设置权限
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()//配置具体拦截情况和授权角色
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                    .antMatchers("/staticResources/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()//支持表单登录进行认证
                    .loginPage("/login").permitAll()
                    .and()
                .httpBasic()//支持HTTP Basic方式进行认证
                    .and()
                .logout()//配置登出设置
                    .logoutUrl("/logout")
                    .logoutSuccessUrl("/index")
                    .invalidateHttpSession(true);
    }

    //设置SpringSecurity的授权用户
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //设置缓存用户
        auth.inMemoryAuthentication()
                .withUser("lzp").password("lzp").roles("USER","ADMIN","DBA")
                .and()
                .withUser("lizhupeng").password("lizhupeng").roles("USER");
//        //可以使用JDBC设置授权用户
//        auth.jdbcAuthentication();
        auth.userDetailsService(new UserAutenticationService());

    }


    public void configure(WebSecurity web) throws Exception{
    }
}
