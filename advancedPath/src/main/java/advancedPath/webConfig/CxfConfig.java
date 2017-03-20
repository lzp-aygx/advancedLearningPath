package advancedPath.webConfig;


import org.springframework.context.annotation.Configuration;

/**
 * Created by lizhupeng on 2017/3/9.
 */
/**
 * 配置类中的方法上添加@Bean注解会告诉Spring,这个方法将会返回一个对象,
 * 并且该对象会注册到Spring 上下文中.
 * 默认情况下,@Bean方法返回的Bean的Id会和方法名一样.
 * */


@Configuration
public class CxfConfig {
//
//    /**
//     * 配置CXFServlet拦截器*/
//    @Bean
//    public ServletRegistrationBean dispatcherServlet() {
//        ServletRegistrationBean cxfServlet = new ServletRegistrationBean(new CXFServlet(), "/webService/*");
//        cxfServlet.setLoadOnStartup(0);
//        cxfServlet.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        return cxfServlet;
//    }
//
//    @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus() {
//        return new SpringBus();
//    }

//    @Bean
//    public SDMSService sdmsService() {
//        return new SDMSServiceImpl();
//    }
//
//    @Bean
//    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(springBus(), sdmsService());
//        endpoint.publish("/sdms");
//        return endpoint;
//    }

}
