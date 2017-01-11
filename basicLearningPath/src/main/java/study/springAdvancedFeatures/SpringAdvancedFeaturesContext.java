package study.springAdvancedFeatures;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by lizhupeng on 2017/1/10.
 */
/**
* Spring 通过任务执行器(TaskExecutor)来实现多线程和并发编程.
* 使用ThreadPoolTaskExecutor来实现一个基于线程池的TaskExecutor.
* 通过在配置类上加入@EnableAsync注解来开启异步任务的支持.
*
* 配置类实现AsyncConfigurer接口并且重写getAsyncExecutor方法,
* 并返回一个ThreadPoolTaskExecutor,这样我们就获得一个基于线程池TaskExecutor
* */

/**
* @Enable*注解的介绍和工作原理
*   1.@EnableAspectJAutoProxy: 开启对AspectJ自动代理的支持.
*   2.@EnableAsync:开启异步方法的支持.
*   3.@EnableScheduling:开启计划任务的支持
*   4.@EnableWebMvc:开启Web MVC的配置支持.
*   5.@EnableConfigurationProperties:开启对@ConfigurationProperties注解配置Bean的支持
*   6.@EnableJpaRepositories:开启SpringData JPA Repository的支持
*   7.@EnableCaching: 开启注解式的缓存支持
*  实现原理有三种:
*     1.直接导入配置类
*     2.依据条件选择配置类
*     3.动态注册Bean
* */


/**
* 元注解:
*  元注解就是可以注解到别的注解上的注解.
*  Spring的很多注解都是可以作为元注解来构成组合注解.
*   例如Configuration注解就是组合了@Component注解
* */

@Configuration
@ComponentScan(value = "study.springAdvancedFeatures")
@EnableAsync//开启异步任务的支持
@EnableScheduling
public class SpringAdvancedFeaturesContext implements AsyncConfigurer {

    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        return taskExecutor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

    /*
    * 基于条件的Bean创建,使用@Conditional注解来创建满足指定条件的Bean
    * */
    //通过配置@Conditional注解,符合WindowsCondition条件则实例化windowsBean
    @Bean
    @Conditional(WindowsCondition.class)
    public ConditionServiceInterface windowsBean() {
        return new WindowsBean();
    }

    //通过配置@Conditional注解,符合WindowsCondition条件则实例化linuxBean
    @Bean
    @Conditional(LinuxCondition.class)
    public ConditionServiceInterface linuxBean() {
        return new LinuxBean();
    }
}
