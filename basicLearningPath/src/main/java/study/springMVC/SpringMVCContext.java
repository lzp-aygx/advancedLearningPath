package study.springMVC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

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
/**
 * SpringMVC配置类可以继承WebMvcConfigurationAdapter,并且重写相关方法来完成对应的配置
 * */
@Configuration
@EnableWebMvc
@ComponentScan(value = "study.springMVC")
//继承WebMvcConfigurerAdapter可以重写其方法进而可以对SpringMVC进行配置
public class SpringMVCContext extends WebMvcConfigurerAdapter{

    /**配置JSP视图解析器*/
//    public void configureViewResolvers(ViewResolverRegistry registry){
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/classes/views/");
//        viewResolver.setSuffix(".jsp");
//        registry.viewResolver(viewResolver);
//    }

    /**通过重写addResourceHandlers方法来配置静态资源*/
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        //addResourceHandler:指定对外暴露的访问地址
        //addResourceLocations:指定文件放置的目录
        registry.addResourceHandler("/staticResources/**").addResourceLocations("classpath:/staticResources/");
    }

    /**通过重写addInterceptors方法来配置拦截器*/
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new DemoInterCeptor());
    }

    /**配置ThymeleafViewResolver视图解析器*/
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver){
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    @Bean
    public TemplateResolver templateResolver(){
        TemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/classes/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }

}
