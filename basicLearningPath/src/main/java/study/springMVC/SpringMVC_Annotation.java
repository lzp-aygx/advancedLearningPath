package study.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lizhupeng on 2016/6/17.
 */
@Controller
//@Scope("prototype")
public class SpringMVC_Annotation {
    public SpringMVC_Annotation() {
        System.out.println("Initialize SpringMVC_Annotation");
    }

    @RequestMapping(value = "/SpringMVC_Annotation.action")
    public String hello(Model model){
        System.out.println("helloWord");
        model.addAttribute("message", "这是我的第二个springmvc应用程序");
        return "/index.jsp";
    }
}
