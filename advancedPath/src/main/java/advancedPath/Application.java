package advancedPath;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lizhupeng on 2016/11/7.
 */

//@ImportResource({"classpath:spring-context.xml",classpath:spring-OtherContext.xml})
//@SpringBootApplication annotation is equivalent to using @Configuration ,@EnableAutoConfiguration and ComponentScan
@ComponentScan//默认扫面这个配置类下面的全部目录
@Configuration//配置类注解
@EnableAutoConfiguration//SpringBoot的主要源码,自动配置类,springboot根据类路径中的jar包依赖为当前项目进行自动装配
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Application.class);
        //设置SpringApplication的Banner,当前设置是屏蔽了Banner,也可以在配置文件上关闭
        //app.setBannerMode(Banner.Mode.OFF);
        app.addInitializers();
        app.run(args);
        //SpringApplication.run(Application.class, args);
    }
}
