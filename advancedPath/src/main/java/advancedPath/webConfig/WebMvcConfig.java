package advancedPath.webConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lizhupeng on 2017/2/22.
 */

/**
 * 接管SpringBoot的Web配置,在Springboot自动装配的便利下增加自己额外的配置只需要继承WebMvcConfiguration类就可以了
 * 如果需要完全接管Web配置的话需要在类上增加注解@EnableWebMvc注解来实现完全自己控制Web配置
 * */
//@EnableWebMvc//完全接管SpringBoot的自动配置
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    public void addViewControllers(ViewControllerRegistry registry) {
        //打包成可运行的jar包的时候无法运行下面定于的Controller
        //配置模板页webSocket.html的访问地址为/ws
        registry.addViewController("/ws").setViewName("/webSocket");
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/chat").setViewName("/chat");
    }

}
