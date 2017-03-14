package advancedPath.service;

import advancedPath.domain.RollInfoItem;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Created by lizhupeng on 2017/3/9.
 */
@WebService
@BindingType(SOAPBinding.SOAP11HTTP_BINDING)//指定发布服务的协议类型
public interface SDMSService {
    @WebMethod
    @WebResult(name = "rollInfoItem") RollInfoItem findRollInfoItemByRollNo(@WebParam(name = "roolNo") String roolNo);
}
