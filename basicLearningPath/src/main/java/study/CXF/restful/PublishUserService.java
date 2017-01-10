package study.CXF.restful;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Created by lizhupeng on 2016/7/13.
 */
/*发布Restful的WebService使用的是JAXRSServerFactory工厂类*/
public class PublishUserService {
    public static void main(String[] args) {
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        jaxrsServerFactoryBean.setAddress("http://127.0.0.1:12345/rest");
        //设置服务对象
        jaxrsServerFactoryBean.setServiceBean(new UserServiceImpl());
        //设置资源对象,如果有多个pojo资源对象中间以半角逗号隔开
        jaxrsServerFactoryBean.setServiceClass(UserServiceImpl.class);
        jaxrsServerFactoryBean.create();
    }
}
