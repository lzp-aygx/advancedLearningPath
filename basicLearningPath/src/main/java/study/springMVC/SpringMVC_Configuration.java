package study.springMVC;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lizhupeng on 2016/6/17.
 */
public class SpringMVC_Configuration implements Controller{
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("--------------helloWord--------------");
        modelAndView.addObject("message","这是我手动配置版的springmvc应用程序");
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }
}
