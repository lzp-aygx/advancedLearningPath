package com.myproject.springCloudApp.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2017/12/6.
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${word}")
    private String word;

    @Value("${word11}")
    private String word11;

    @ApiOperation(value="测试", notes="Hello world")
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello() {
        System.out.println("hello");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello world " + port;
    }

    @ApiOperation(value="测试", notes="Hello world")
    @RequestMapping(value = "/word" ,method = RequestMethod.GET)
    public String word() {
        return this.word;
    }

    @ApiOperation(value="测试", notes="Hello world")
    @RequestMapping(value = "/word11" ,method = RequestMethod.GET)
    public String word11() {
        return this.word11;
    }

}
