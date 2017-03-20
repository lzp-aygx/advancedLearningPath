package study.springAdvancedFeatures;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by lizhupeng on 2017/1/10.
 */

/**
* Bean对Spring容器的存在是没有意识的,
* Spring Aware 将会使得Bean与Spring框架进行耦合.让bean意识到容器的存在,并且操作容器里面的服务
* Spring Aware提供的接口如下;
*   1.BeanNameAware:获取容器中bean的名称.
*   2.BeanFactoryAware:获取当前beanFactory,这样可以调用容器的其他服务
*   3.ApplicationContextAware*:获取当前application context
*   4.MessageSourceAware:应用时间发布器,可以发布事件
*   5.ResourceLoaderAware:资源加载器,可以获得外部资源文件
* */


@Service
public class SpringAware implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;


    public void setBeanName(String name) {
        this.beanName = name;
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean name : " + beanName);
        Resource resource = loader.getResource("SpringAwareTest.txt");
        try {
            System.out.println("SpringAwareText context:"+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
