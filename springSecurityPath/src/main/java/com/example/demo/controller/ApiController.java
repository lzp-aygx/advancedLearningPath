package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lizhupeng on 2017/9/21.
 */


@Controller
public class ApiController {


    @RequestMapping(value = "/api/test" , method = RequestMethod.GET)
    @ResponseBody
    public String getHelloTest(){
        return "hello Test";
    }


    @RequestMapping(value = "/api/user" , method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasRole('USER')")
    public String getHelloUser(){
        return "hello USER";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "/api/admin" , method = RequestMethod.GET)
    @ResponseBody
    public String getHelloAdmin(){
        return "hello ADMIN";
    }


}
