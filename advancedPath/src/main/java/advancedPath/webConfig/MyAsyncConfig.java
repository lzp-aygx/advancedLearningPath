package advancedPath.webConfig;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author lizhupeng
 * @date 2018/01/10
 */
@EnableAsync
@Configuration
public class MyAsyncConfig implements AsyncConfigurer {


    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //线程池最小线程数
        executor.setCorePoolSize(5);
        //线程池最大线程数
        executor.setMaxPoolSize(40);
        //线程池所使用的缓冲队列
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("MyExecutor-");
        //线程池维护线程所允许的空闲时间(秒)
        executor.setKeepAliveSeconds(180);
        executor.initialize();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
