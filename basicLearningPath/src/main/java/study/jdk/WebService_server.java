package study.jdk;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by lizhupeng on 2016/5/27.
 */
/*jdk 1.6后提供注解@webservice注解,用在类上,将该类发不成一个WS.
 * Endpoint-此类为端点服务类,它的方法publish用于讲一个已经添加了@webservice注解对象绑定到一个地址的端口上..
 *
 * 如何发布一个webservice服务的:
 * 	1.在类上添加@WebService注解.
 * 	2.通过EndPoint(端点服务)发布一个webService
 * 		Endpoint也是jdk提供的一个专门用于发布服务的类,它的publish方法接收两个参数.
 * 		一个是本地的服务地址,二是提供服务的类,它位于javax.xml.ws.*这个包中
 *
 * 		static Endpoint.publish(String address,Object implementor)在给定地址处针对制定的实现者对象创建并发布端点
 * 		stop方法用于停止服务
 * 		EndPoint发布完成服务以后,将会独立的线程运行,所以publish之后的代码,可以正常执行.
 * 	注意事项:
 * 		添加了@WebService的类中所有的非静态方法都会对外发布.//不支持静态方法,final方法
 * 		希望不公开某个非静态方法的时候需要在该方法上添加注解@WebMethod(exclude=true)
 * 		添加@WebServuce的类至少要有一个可以发布的非静态方法,否者会启动失败.
 *
 * 	WebService的调用方式:
 * 		参数 -d:将生成.class文件  -s:将生成.java文件 -p:指定输出包名
 *  	通过wsimport生成客户端代码  wsimport –s E:\com http://192.168.0.100/one?wsdl
 *		通过客户端编程的方式调用
 *		通过ajax调用SOAP
 * */

@WebService
public class WebService_server {

    public String sayHello(String name){
        System.out.println(name);
        return "hello"+name;
    }
    @WebMethod(exclude = true)
    public @WebResult(name = "return") String HelloWord(@WebParam(name="name") String name){
        System.out.println(name);
        return "hello"+name;
    }

    public static void main(String[] args) {
        String address="http://127.0.0.1:9999/WebService_server";
        //使用端点服务,将对象绑定到一个地址和端口号中,其中同事必须要在端口后面给服务取一个个名称
        //这个就可以通过http访问绑定的地址,在通过服务名称访问服务中的方法
        Endpoint endpoint = Endpoint.publish(address,new WebService_server());
//        endpoint.stop();
    }
}
