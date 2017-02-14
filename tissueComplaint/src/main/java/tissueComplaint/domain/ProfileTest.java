package tissueComplaint.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2017/1/16.
 */
@RestController
@RequestMapping(value = "profile")
//不加这个注解,用maven打包的时候将会报错.无法找到对应的配置信息
@PropertySource("classpath:config/application-custom.properties")
public class ProfileTest {

    @Value("${project.author}")
    private String author;
    @Value("${project.name}")
    private String name;

    @RequestMapping(value = "getProjectInfoByValue")
    public String getProjectInfo(){
        return this.author + this.name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
