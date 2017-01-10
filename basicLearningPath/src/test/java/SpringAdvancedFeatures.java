import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.springAdvancedFeatures.SpringAdvancedFeaturesContext;
import study.springAdvancedFeatures.SpringAware;

/**
 * Created by lizhupeng on 2017/1/10.
 */
public class SpringAdvancedFeatures {
    public static void main(String[] args) {
        //引用配置类,初始化一个上下文
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringAdvancedFeaturesContext.class);

        //从上下文中获取bean实例
        SpringAware springAware = context.getBean(SpringAware.class);
        springAware.outputResult();
    }
}
