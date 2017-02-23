package tissueComplaint.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


/**
 * Created by Administrator on 2016/6/23.
 */
@WebService(targetNamespace = "http://service.learningPath.cn/",//包的地址结构会根据命名空间的命名倒写如生成客户端的时候的包的结构为cn.learningpath.service
            name = "helloWorldName",//着就是暴露出去的服务的porttype的名称,也就是binding的类型名称
            portName = "helloWorldPortName",
            serviceName = "helloWorldServcieName")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)//指定发布服务的协议类型
public interface HelloWorldService {
    //接口中的方法的参数@WebParam注解是必须的,因为java接口不存储参数名称,如果不配置名字将会被命名为arg0
    @WebMethod
    @WebResult(name = "sayHelloMessage") String sayHello(@WebParam(name = "name") String name);
    @WebMethod
    @WebResult(name = "languageRaningMessage") String languageRaning(@WebParam(name = "ranking") int ranking);
}
