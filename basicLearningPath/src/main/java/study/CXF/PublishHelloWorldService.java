package study.CXF;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Created by Administrator on 2016/6/30.
 */
/*使用CXF部署WebService有两个方法,可以使用ServerFactoryBean和JaxWsServerFactoryBean两个的工厂类来实现和发布*/
    /*使用CXF中ServerFactoryBean的方法发布webService
    1.不支持注解
    2.不支持拦截器*/


    /*使用CXF中ServerFactoryBean的子类JaxWsServerFactoryBean
    * 1.JaxWsServerFactoryBean对ServerFactoryBean类进行了功能扩展
    * 2.此类,必须要在被发布为服务的类上添加@WebService注解,如果不加注解,
    * 不会报错,但是不会暴露出任何方法出去.使用此类生成的wsdl文件更加规范
    * 3.此类可以通过使用添加拦截器拦截请求
    **/
public class PublishHelloWorldService {
    public static void main(String[] args) {
        //面向接口创建
        HelloWorldServiceInterface ws = new HelloWorldService();
        ServerFactoryBean bean = new ServerFactoryBean();
        bean.setAddress("http://127.0.0.1:9999/webService/hello");
        //制定对外提供WebService的业务类或者接口
        bean.setServiceBean(HelloWorldServiceInterface.class);
        //服务的实现bean
        bean.setServiceBean(ws);
        bean.create();//默认启动的是jetty容器
    }
    /*
    public static void main(String[] args) {
        HelloWorldService ws = new HelloWorldService();
        JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();
        bean.setAddress("http://127.0.0.1:9999/hello");
        bean.setServiceClass(HelloWorldServiceInterface.class);
        bean.setServiceBean(ws);
        bean.getInInterceptors().add(new LoggingInInterceptor());  //添加输入拦截器
        bean.getOutInterceptors().add(new LoggingOutInterceptor());//添加输出拦截器
        bean.create();//默认启动的是jetty容器
//        System.out.println("Starting Server");
//        HelloWorldService helloWordService = new HelloWorldService();
//        String address = "http://localhost:9999/helloWorld";
//        Endpoint.publish(address,helloWordService);
    }*/

}
