package advancedPath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhupeng
 * @date 2018/01/12
 */
@RestController
public class TestController {


    @GetMapping("/testThread")
    public String testThread() throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(100000);
        return Thread.currentThread().getName();
    }

}
