package com.lzp.springcloud.service;

import com.lzp.springcloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lizhupeng on 2017/12/26.
 */
@FeignClient(name = "EUREKACLIENT-01")
public interface TestFeignService {

    @RequestMapping("/hello")
    String hello();

    @PostMapping("/user")
    String postUser(@RequestBody User user);

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable(value = "id") String id);

}
