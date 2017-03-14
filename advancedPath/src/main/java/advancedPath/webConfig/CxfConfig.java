package advancedPath.webConfig;


import org.springframework.context.annotation.Configuration;

/**
 * Created by lizhupeng on 2017/3/9.
 */
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
//        SpringBus springBus = new SpringBus();
//        return springBus;
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
