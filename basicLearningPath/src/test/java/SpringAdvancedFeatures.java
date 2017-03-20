import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.springAdvancedFeatures.ConditionServiceInterface;
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

        //测试SpringAware
        SpringAware springAware = context.getBean(SpringAware.class);
        springAware.outputResult();

        //测试条件Bean,面向接口获取条件实例的Bean
        ConditionServiceInterface conditionServiceInterface = context.getBean(ConditionServiceInterface.class);
        System.out.println("OS:"+conditionServiceInterface.showBeanName());


        //定时任务测试
//        SpringJob springJob = context.getBean(SpringJob.class);
//        springJob.fixTimeExecution();
//        springJob.reportCurrentTime();


    }
}
