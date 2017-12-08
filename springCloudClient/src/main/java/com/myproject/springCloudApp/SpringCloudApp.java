package com.myproject.springCloudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lizhupeng on 2017/6/28.
 */

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudApp.class, args);
    }
}
