package com.myproject.springCloudApp.controller;

import com.myproject.springCloudApp.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lizhupeng on 2017/12/8.
 */
@RestController
public class UserController {


    @ApiOperation(value = "提交用户", notes = "添加用户")
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String postUser(@RequestBody User user) {
        System.out.println(user);
        return "1";
    }

//    @ApiOperation(value = "获取用户", notes = "添加用户")
//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//    public User getUser(@PathVariable String id) {
//        User user = new User();
//        user.setId("1");
//        user.setPhone("000000");
//        user.setUserName("张学友");
//        return user;
//    }

    @ApiOperation(value = "删除用户", notes = "添加用户")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id) {
        return "Delete " + id;
    }


}
