package com.lzp.springSecurity.config;//package com.leeman.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//
///**
// * Created by lizhupeng on 2017/7/28.
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true) //开启Security的方法注解
//public class SpringSecurityConfig {
//
//
//
//    @Configuration
//    @Order(1)
//    public class WeChatSecurityConfig extends WebSecurityConfigurerAdapter {
//        protected void configure(HttpSecurity http) throws Exception {
//            //屏蔽防跨域请求.
//            http.authorizeRequests()
//                    .mvcMatchers("/wechat/**").permitAll()
//                    .mvcMatchers("/wechatauth").permitAll()
////                .mvcMatchers("/api/user").hasRole("USER")
////                .mvcMatchers("/api/admin").hasRole("ADMIN")
//                    .anyRequest().authenticated()
//                    .and().formLogin().loginPage("/register").permitAll()
//                    .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                    .and().csrf().disable();
//        }
//        //忽略静态资源的拦截
//        public void configure(WebSecurity web) throws Exception {
//            web.ignoring().antMatchers("/**/*.js","/**/*.css","/**/*.png","/**/*.jpg");
//        }
//
//    }
//    @Configuration
//    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                    .authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and().formLogin().loginPage("/register").permitAll();
//        }
//        //忽略静态资源的拦截
//        public void configure(WebSecurity web) throws Exception {
//            web.ignoring().antMatchers("/**/*.js","/**/*.css","/**/*.png","/**/*.jpg");
//
//        }
//    }
//
//
//}
