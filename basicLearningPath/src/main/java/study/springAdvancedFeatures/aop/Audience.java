package study.springAdvancedFeatures.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by lizhupeng on 2017/3/21.
 */


@Aspect
@Component
public class Audience {

    @Pointcut("execution(* study.springAdvancedFeatures.aop.Performance.perform(String,int)) " +
            "&& args(actor,num)")
    public void performance(String actor,int num) {
    }

    @Before("performance(actor,num)")
    public void beforePerformance(String actor,int num) {
        System.out.println("@Before表演前宣布,表演者为"+ actor + "  演唱歌曲:" + num + "首");
    }


    @Around("execution(* study.springAdvancedFeatures.aop.Performance.perform(..))")
    public void performancePointCut(ProceedingJoinPoint jp) {
        try {
            System.out.println("@Around-beforePerformance");
            jp.proceed();//如果这个方法不运行的话被通知的方法会被阻塞
            System.out.println("@Around-afterPerformance");
        } catch (Throwable e) {
            System.out.println("@Around-PerformanceFault");
        }
    }


}
