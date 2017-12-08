package com.lzp.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lizhupeng on 2017/12/7.
 */
@RestController
public class testConsumer {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/testConsumer",method = RequestMethod.GET)
    public String testConsumer(){
        return restTemplate.getForEntity("http://EUREKACLIENT-01/hello",String.class).getBody();
    }
}
