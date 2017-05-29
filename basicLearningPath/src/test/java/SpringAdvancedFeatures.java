import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.springAdvancedFeatures.ConditionServiceInterface;
import study.springAdvancedFeatures.RunTimeInject;
import study.springAdvancedFeatures.SpringAdvancedFeaturesContext;
import study.springAdvancedFeatures.SpringAware;
import study.springAdvancedFeatures.aop.Performance;
import study.springAdvancedFeatures.persistent.User;
import study.springAdvancedFeatures.persistent.UserMapper;

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
        System.out.println("OS:" + conditionServiceInterface.showBeanName());

        RunTimeInject runTimeInject = context.getBean(RunTimeInject.class);
        System.out.println("SpringRunTimeInject 读取静态配置文件配置Bean属性 " +
                "工程名:" + runTimeInject.getProjectName() +
                "  作者" + runTimeInject.getAuthor() +
                "  版本" + runTimeInject.getVersions());

        Performance performance = context.getBean(Performance.class);
        performance.perform("周杰伦",5);


        UserMapper userMapper = context.getBean(UserMapper.class);
        System.out.println(userMapper.getUser(1));
        System.out.println(userMapper.getUsers());
        User user1 = new User(8,"金明","8888","leeman",25);
//        System.out.println(userMapper.insertUser(user1));



    }
}
