package com.lzp.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lizhupeng on 2017/11/27.
 */

@Controller
public class TestController {

    @RequestMapping("/api/mytest")
    @ResponseBody
    public String root() {
        return "mytest";
    }
}
