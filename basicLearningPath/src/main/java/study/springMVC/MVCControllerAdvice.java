package study.springMVC;

/**
 * Created by lizhupeng on 2017/1/12.
 */


import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ControllerAdvice
 * 通过@ControllerAdvice,可以将对于控制器的全局配置放到同一个位置,注解了@Controller的类中的方法
 * 可以使用@ExceptionHandler,@InitBinder,@ModelAttribute注解到方法上,这样的注解对所有的@RequsetMapping的控制器内的方法有效
 * */

//声明一个控制器建言,这个注解组合了Component注解
@ControllerAdvice
public class MVCControllerAdvice {
    //定义全局控制器啊的异常处理,通过注解里面的value属性可以拦击不同的异常,
    //并且每当拦截了该异常就会调用下面的方法.
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    //注解将键值对添加到全局,所有@RequestMapping的方法可以获取到此键值对
    @ModelAttribute
    public void addAttributes(Model model){
    }

    //
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
    }
}
