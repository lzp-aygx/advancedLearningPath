package study.springMVC;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.springMVC.entity.Product;


/**
 * Created by lizhupeng on 2017/1/11.
 */

/**
 * 标记一下下面没有例子请求数据获取的参数，其中SessionAttributes和@CookieValue只是使用在类级别上
 *@ModelAttribute 、 @SessionAttributes 和 @CookieValue
 *可以获取对应的Model属性、Session属性和Cookie属性
 * */
@Controller
public class IndexController {
    /**
     * produces中的设置可以修改返回数据的类型,
     * consumes中可以设置指定接收请求中消息头的Content-Type,如果请求头的类型没有对应上就会报错
     * 如果需要返回对象的类型是json就修改为application/json
     * 如果需要返回对象的类型是xml就修改为application/xml,并且在返回类型的定义头加上@XmlRootElement注解
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String index(Model model) {
        model.addAttribute("msg", "Welcome to Spring MVC Thymeleaf Template");
        return "index";
    }

    @RequestMapping(value = "/index/operator/{operator}")
    public String getPathVar(Model model, @PathVariable String operator) {
        System.out.println(operator);
        model.addAttribute("msg", "Welcome " + operator);
        return "index";
    }

    @RequestMapping(value = "/index/operator")
    public String getParam(Model model, @RequestParam(name = "operator" ,required = false) String operator) {
        System.out.println(operator);
        model.addAttribute("msg", "Welcome " + operator);
        return "index";
    }

    @RequestMapping(value = "/index/redirect")
    public String redirect(Model model) {
        return "redirect:/";
    }

    @RequestMapping(value = "/index/matrixVar/{dog}" ,method = RequestMethod.GET)
    public String matrixVar(Model model,
                            @PathVariable String dog,
                            @MatrixVariable(name = "color", required = false, defaultValue = "hello world", pathVar = "dog") String color1) {
        System.out.println(dog + " color: " + color1);
        model.addAttribute("msg", "dog: " + dog + " color: " + color1);
        return "index";
    }

    //如果需要返回MediaType类型而不是返回给视图解析器的话需要配置@ResponseBody,并且可以在Mapping上指定返回的媒体类型
    //默认的返回媒体类型是Json,如果想要返回的是Xml的话需要在返回的类型上增加@XmlRootElement
    @RequestMapping(value = "/index/mediaType" ,produces = "application/xml;charset=UTF-8")
    @ResponseBody
    public Product mediaType(Model model) {
        Product p1 = new Product();
        p1.setCompanyId("shasha");
        p1.setProductCategory("ssss");
        p1.setProductId("11");
        return p1;
    }

    //可以通过@RequestHeader来获取HTTP请求的消息头的信息
    @RequestMapping(value = "/index/requestHeader" ,produces = "text/html;charset=UTF-8")
    public String getRequestHeader(Model model,@RequestHeader HttpHeaders headers){
        headers.toString();
        model.addAttribute("msg", "header:" + headers.getAccept() + headers.getLocation());
        return "index";
    }
}
