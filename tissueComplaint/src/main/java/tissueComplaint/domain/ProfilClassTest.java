package tissueComplaint.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lizhupeng on 2017/1/16.
 */

@RestController
@RequestMapping(value = "profile")
@ConfigurationProperties(prefix = "project")
public class ProfilClassTest {

    private String author;
    private String name;

    @RequestMapping(value = "getProjectInfoByClass")
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
