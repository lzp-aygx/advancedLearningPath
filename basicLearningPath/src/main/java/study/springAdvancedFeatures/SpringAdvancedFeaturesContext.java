package study.springAdvancedFeatures;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by lizhupeng on 2017/1/10.
 */
/*
* Spring 通过任务执行器(TaskExecutor)来实现多线程和并发编程.
* 使用ThreadPoolTaskExecutor来实现一个基于线程池的TaskExecutor.
* 通过在配置类上加入@EnableAsync注解来开启异步任务的支持.
*
* 配置类实现AsyncConfigurer接口并且重写getAsyncExecutor方法,
* 并返回一个ThreadPoolTaskExecutor,这样我们就获得一个基于线程池TaskExecutor
* */


@Configuration
@ComponentScan(value = "study.springAdvancedFeatures")
@EnableAsync//开启异步任务的支持
public class SpringAdvancedFeaturesContext implements AsyncConfigurer{

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
}
