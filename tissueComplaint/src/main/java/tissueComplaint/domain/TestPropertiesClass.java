package tissueComplaint.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by lizhupeng on 2017/1/12.
 */

@Component
@ConfigurationProperties(prefix = "project")
public class TestPropertiesClass {

    @Value("${project.author}")
    private String author;

    @Value("${project.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
