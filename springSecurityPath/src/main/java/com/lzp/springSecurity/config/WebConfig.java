package com.lzp.springSecurity.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lizhupeng on 2017/9/21.
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean(name = "dataSource", destroyMethod = "close")
    @Primary
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/learningpath");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }


    @Bean
    public WeChatInterceptor webAppInterceptor(){
        return new WeChatInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(webAppInterceptor()).addPathPatterns("/api/**").excludePathPatterns("/api/mytest","/api/test");
        super.addInterceptors(registry);
    }
}
