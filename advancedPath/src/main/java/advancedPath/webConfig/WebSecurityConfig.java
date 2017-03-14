package advancedPath.webConfig;

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
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/login").permitAll() //配置根路径和/login路径为不拦截路径
                .and()
                .formLogin()
                .loginPage("/login")//配置登录页面
                .defaultSuccessUrl("/chat")//设置登录成功转向的页面
                .permitAll()
                .and()
                .logout()
                .permitAll();
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
