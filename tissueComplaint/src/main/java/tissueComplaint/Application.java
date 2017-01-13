package tissueComplaint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2016/11/7.
 */


//@SpringBootApplication annotation is equivalent to using @Configuration ,@EnableAutoConfiguration and ComponentScan
@RestController
@ComponentScan//默认扫面这个配置类下面的全部目录
@Configuration//配置类注解
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    String home(){

        return "Welcome to tissueComplaint";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);


        //SpringApplication.run(Application.class, args);
    }
}
