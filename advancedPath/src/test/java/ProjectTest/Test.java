package ProjectTest;

import com.leeman.esb.test.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by lizhupeng on 2017/3/9.
 */
public class Test {


    public static void main(String[] args) throws Exception{
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://esbtest.leemanpaper.com/CustomerRelationshipManagement/CustomerComplaintsInfo/v001");
//        jaxWsProxyFactoryBean.setAddress("http://172.23.3.86:9811/CustomerRelationshipManagement/CustomerComplaintsInfo/v001");
        jaxWsProxyFactoryBean.setServiceClass(CustomerComplaintsInfo.class);
        CustomerComplaintsInfo customerComplaintsInfo = jaxWsProxyFactoryBean.create(CustomerComplaintsInfo.class);
        int j = 0;

        for (int i=0;i<10000;i++){
            try {
                RequestHeaderType requestHeaderType = new RequestHeaderType();
                requestHeaderType.setSourceID("test");
                CustomerComplaintsType customerComplaintsType = new CustomerComplaintsType();
                customerComplaintsType.setRemarks("test");
                PublishComplaintsAcceptanceEvent publishComplaintsAcceptanceEvent = new PublishComplaintsAcceptanceEvent();
                publishComplaintsAcceptanceEvent.setCustomerComplaintsInfo(customerComplaintsType);
                PublishComplaintsAcceptanceEventResponse publishComplaintsAcceptanceEventResponse = customerComplaintsInfo.publishComplaintsAcceptanceEvent(publishComplaintsAcceptanceEvent,requestHeaderType);
            }catch (Exception e){
                j++;
            }finally {
                System.out.println("i: "+i+"  j: "+ j);
            }

        }





    }
}
