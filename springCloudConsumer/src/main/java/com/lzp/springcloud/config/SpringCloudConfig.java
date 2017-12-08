package com.lzp.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lizhupeng on 2017/12/8.
 */

@Configuration
public class SpringCloudConfig {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    //修改Ribbon负载均衡的策略
//    @Bean
//    public IRule ribbonRule(){
//        return new RandomRule();
//    }
}
