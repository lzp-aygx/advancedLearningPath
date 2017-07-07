package com.myproject.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by lizhupeng on 2017/6/22.
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudEurekaServer.class, args);
    }

}
