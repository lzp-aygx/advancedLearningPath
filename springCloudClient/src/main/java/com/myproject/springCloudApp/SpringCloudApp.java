package com.myproject.springCloudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2017/6/28.
 */

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudApp {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudApp.class, args);
    }
}
