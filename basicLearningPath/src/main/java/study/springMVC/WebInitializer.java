package study.springMVC;

/**
 * Created by lizhupeng on 2017/1/11.
 */


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Web配置类,是Spring提供用来配置Servlet3.0+配置的接口,从而实现了代替web.xml的位置.
 * 实现此接口将会自动被SpringServletContainerInitializer获取到*/

public class WebInitializer implements WebApplicationInitializer{

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCContext.class);
        ctx.setServletContext(servletContext);

        Dynamic servlet =servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
