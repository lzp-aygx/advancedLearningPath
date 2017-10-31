package study.springAdvancedFeatures.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lizhupeng on 2017/10/10.
 */

/**
 * @After 通知方法会在目标方法返回或抛出异常后调用
 * @AfterReturning 通知方法会在目标方法返回后调用
 * @AfterThrowing 通知方法会在目标方法抛出异常后调用
 * @Around 通知方法会将目标方法封装起来
 * @Before 通知方法会在目标方法调用之前执行*/
@Aspect
@Component
public class LoggerAspect {

    private static Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Pointcut("execution(* study.*.*.*(..))")
    public void commonPointcut(){}

    //使用环绕通知将全部请求写入日志
    @Around("commonPointcut()")
    public Object common(ProceedingJoinPoint joinPoint){
        //定义一个对象记录切面方法的处理结果.并且将整个结果返回.从而不影响SpringMVC
        Object result = null;
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest httpServletRequest = requestAttributes.getRequest();
        try {
            //调用joinPoint.proceed();前代码为切面前置通知,如果执行成功没有异常则执行后置通知否则异常会被捕捉到,并且执行异常通知.
            result=joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            //将切面的异常重新抛出.从而不影响SpringMVC的正常运作
            throw new RuntimeException(throwable);
        }
        return result;
    }

//    //使用环绕通知将所有工作流审批的请求写入日志
//    @Around("approvePointcut()")
//    public void approveAround(ProceedingJoinPoint joinPoint){
//        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
//        LoggerInfo loggerInfo = new LoggerInfo();
//        try {
//            loggerInfo.setEmployeeId((String)joinPoint.getArgs()[0]);
//            loggerInfo.setRequestPath(requestAttributes.getRequest().getRequestURI());
//            loggerInfo.setRequestMethod(requestAttributes.getRequest().getMethod());
//            loggerInfo.setMethodParams(Arrays.toString(joinPoint.getArgs()));
//            loggerInfo.setStartTime(DateUtils.getCurrentDateTime());
//            //调用joinPoint.proceed();前代码为切面前置通知,如果执行成功则执行后置通知否则运行下面的异常通知.
//            joinPoint.proceed();
//            loggerInfo.setEndTime(DateUtils.getCurrentDateTime());
//            loggerInfo.setIsSuccess("1");
//        } catch (Throwable throwable) {
//            loggerInfo.setEndTime(DateUtils.getCurrentDateTime());
//            loggerInfo.setIsSuccess("0");
//            loggerInfo.setExceptionInfo(throwable.getMessage());
//            throwable.printStackTrace();
//        }finally {
//            logger.info(loggerInfo);
//        }
//    }

}
