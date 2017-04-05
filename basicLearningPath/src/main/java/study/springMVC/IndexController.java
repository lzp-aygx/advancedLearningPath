package study.springMVC;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by lizhupeng on 2017/1/11.
 */

@Controller
public class IndexController {
    /**produces中的设置可以修改返回数据的类型,
    如果需要返回对象的类型是json就修改为application/json
    如果需要返回对象的类型是xml就修改为application/xml*/
    @RequestMapping(value = "/", method = GET ,produces = "text/html;charset=UTF-8")
    public String index(HttpServletRequest request) {
        return "index";
    }

}
