package study.springAdvancedFeatures;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lizhupeng on 2017/1/16.
 */
@Service
public class SpringJob implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private RunTimeInject runTimeInject;

    @Scheduled(fixedRate = 60000) //轮询执行
    public void reportCurrentTime() {
        Resource resource = loader.getResource("Classpath:/app.properties");

        try {
            System.out.println("每隔一分钟读取一次配置文件:" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("每隔五秒执行一次 " + dateFormat.format(new Date()) + "运行时修改配置文件"+ runTimeInject);
    }

    @Scheduled(cron = "0 03 17 ? * *")//按照指定时间执行,这个例子是指每天11点28分执行.
    public void fixTimeExecution() {
        System.out.println("指定时间 " + dateFormat.format(new Date()) + "执行");
    }

    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }
}
