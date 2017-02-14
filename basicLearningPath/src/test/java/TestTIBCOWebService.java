import com.leemanpaper.schema.technology.framework.common.v001.RequestHeaderType;
import com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001.GetLatestInOutRecordByCardID;
import com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001.GetLatestInOutRecordByCardIDResponse;
import com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001.concrete.VehicleGateControl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by lizhupeng on 2017/2/11.
 */
public class TestTIBCOWebService {
    public static void main(String[] args) throws Exception {

        GetLatestInOutRecordByCardID param = new GetLatestInOutRecordByCardID();
        param.setCardID("271114212");
        param.setOrganizationID("JiangXiPaper");
       RequestHeaderType header = new RequestHeaderType();
        header.setSourceID("TestTIBCOWebService");

//        VehicleGateControlV001 serivce = new VehicleGateControlV001();
//        VehicleGateControl client = serivce.getVehicleGateControlHTTPEndpoint();
//        GetLatestInOutRecordByCardIDResponse result1 = client.getLatestInOutRecordByCardID(param,header);
//        System.out.println(result1.getVehicleInOutRecord());

        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://172.23.1.82:9990/Logistics/Transport/VehicleGateControl/v001");
        jaxWsProxyFactoryBean.setServiceClass(VehicleGateControl.class);
        VehicleGateControl vehicleGateControl = (VehicleGateControl)jaxWsProxyFactoryBean.create();
        GetLatestInOutRecordByCardIDResponse result = vehicleGateControl.getLatestInOutRecordByCardID(param,header);
        System.out.println(result.getVehicleInOutRecord());


    }
}
