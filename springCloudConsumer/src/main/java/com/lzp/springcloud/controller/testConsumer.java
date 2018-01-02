package com.lzp.springcloud.controller;

import com.lzp.springcloud.entity.User;
import com.lzp.springcloud.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by lizhupeng on 2017/12/7.
 */
@RestController
public class testConsumer {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    TestFeignService testFeignService;


    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping(value = "/testConsumer",method = RequestMethod.GET)
    public User testConsumer(){
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://localhost:9993/user/1").build().encode();
        URI uri = uriComponents.toUri();
        HttpHeaders headers = new HttpHeaders();
        User user = restTemplate.getForEntity(uri,User.class).getBody();
        System.out.println(restTemplate.getForEntity("http://localhost:9993/user/1",String.class).getBody() + "   " );
        return user;
    }


    @GetMapping(value = "/hello")
    public String helloWord(){
//        String response = restTemplate.getForEntity("http://EUREKACLIENT-01/hello",String.class).getBody();
        String response = testFeignService.hello();
        return response;
    }


    @GetMapping(value = "/user")
    public String user(){
        User user = new User();
        user.setId("1");
        user.setPhone("13794888475");
        user.setUserName("李柱鹏");
        testFeignService.postUser(user);
        System.out.println(discoveryClient.getInstances("EUREKACLIENT-01"));
        String response = testFeignService.deleteUser("1");
        return response;
    }
}
