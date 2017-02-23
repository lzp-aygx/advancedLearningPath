package study.springMVC;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lizhupeng on 2017/1/11.
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }

    /**produces中的设置可以修改返回数据的类型,
    如果需要返回对象的类型是json就修改为application/json
    如果需要返回对象的类型是xml就修改为application/xml*/
    @RequestMapping(value = "/index",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        return "index";
    }
}
