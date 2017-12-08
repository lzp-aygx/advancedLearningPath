package com.myproject.springCloudApp.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2017/12/6.
 */
@RestController
public class TestController {

    @ApiOperation(value="测试", notes="Hello world")
    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello() {
        return "Hello world";
    }

}
