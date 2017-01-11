package study.springMVC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by lizhupeng on 2017/1/11.
 */

/**
 * SpringMVC常用几个注解
 * @Controller
 * @RequestMapping
 * @ResponseBody:支持返回值放在response体内,而不是返回一个页面,例如用到Ajax调用的方法需要加这样的注解
 * @RequestBody:允许request的参数在request体内,而不是拼接在地址后面
 * @PathVariable:获取路径参数
 * @RestController:组合注解,组合了@Controller和@ResonseBody
 * */

/**
 * 项目中的一些静态资源SpringMVC可以在配置里重写addResourceHandlers来实现*/


@Configuration
@EnableWebMvc
@ComponentScan(value = "study.springMVC")
public class SpringMVCContext extends WebMvcConfigurerAdapter{
//继承WebMvcConfigurerAdapter可以重写其方法进而可以对SpringMVC进行配置
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    //addResourceHandlers方法配置静态资源
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //addResourceHandler:指定对外暴露的访问地址
        //addResourceLocations:指定文件放置的目录
        registry.addResourceHandler("/staticResources/**").addResourceLocations("classpath:/staticResources/");
    }


    //addInterceptors添加拦截器
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new DemoInterCeptor());

    }


}
