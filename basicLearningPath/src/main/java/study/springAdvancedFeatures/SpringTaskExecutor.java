package study.springAdvancedFeatures;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by lizhupeng on 2017/1/10.
 */
/**
* 当配置类开启了对异步任务的支持
* 并且实现了AsyncConfigurer,重写了getAsyncExecutor放法,返回一个基于线程池TaskExecutor
* 这样我们在Bean的方法上添加@Async注解来表明该方法是异步方法,
* 该类的异步方法都会自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
* */


@Service
public class SpringTaskExecutor {

    @Async
    public void asyncTask(int i){
        System.out.println("AsyncTask:" + i);
    }

    @Async
    public void AsyncTaskPuls(int i){
        System.out.println("AsyncTask:" + i);
    }
}
