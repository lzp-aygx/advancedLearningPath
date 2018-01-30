package advancedPath;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by lizhupeng on 2016/11/7.
 */

//@ImportResource({"classpath:spring-context.xml",classpath:spring-OtherContext.xml})
//@SpringBootApplication annotation is equivalent to using @Configuration ,@EnableAutoConfiguration and ComponentScan
//@ComponentScan//默认扫面这个配置类下面的全部目录
//@Configuration//配置类注解
//@EnableAutoConfiguration//SpringBoot的主要源码,自动配置类,springboot根据类路径中的jar包依赖为当前项目进行自动装配
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
