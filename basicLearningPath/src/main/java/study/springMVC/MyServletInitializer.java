package study.springMVC;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by lizhupeng on 2017/4/14.
 */
/**
 * 因为Spring上下文和SpringMVC通过了WebInitializer继承AbstractAnnotationConfigDispatcherServletInitializer
 * 来完成了spring相关的基本配置.当时,当我们想往容器配置其他组件的时候可以单独编写类来完成配置.
 * 由于Spring提供了ServletContainerInitializer的实现类SpringServletContainerInitializer
 * 来查找实现WebApplicationInitializer的类,并将Web容器的配置任务交给它来完成
 * */
public class MyServletInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext ctx =
//                new AnnotationConfigWebApplicationContext();
//        ctx.register(MyWebConfig.class);
//        ctx.setServletContext(servletContext);
//
//        ServletRegistration.Dynamic servlet =
//                servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);


    }
}
