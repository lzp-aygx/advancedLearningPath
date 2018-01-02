package com.lzp.springcloud.service.fallback;

import com.lzp.springcloud.entity.User;
import com.lzp.springcloud.service.TestFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by lizhupeng on 2018/1/2.
 */
@Component
public class TestFeignFallback implements TestFeignService{
    @Override
    public String hello() {
        return "请求失败";
    }

    @Override
    public String postUser(@RequestBody User user) {
        return null;
    }

    @Override
    public String deleteUser(@PathVariable(value = "id") String id) {
        return null;
    }
}
