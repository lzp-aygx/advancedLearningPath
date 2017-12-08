package com.lzp.springcloud.controller;

import com.lzp.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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

    @RequestMapping(value = "/testConsumer",method = RequestMethod.GET)
    public User testConsumer(){
        UriComponents uriComponents = UriComponentsBuilder.fromUriString("http://EUREKACLIENT-01/user/1").build().encode();
        URI uri = uriComponents.toUri();
        HttpHeaders headers = new HttpHeaders();
        User user = restTemplate.getForEntity(uri,User.class).getBody();

        System.out.println(restTemplate.getForEntity("http://EUREKACLIENT-01/user/1",String.class).getBody() + "   " );
        return user;
    }
}
