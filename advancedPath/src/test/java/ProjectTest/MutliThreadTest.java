package ProjectTest;

import com.leeman.esb.test.*;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Created by lizhupeng on 2017/10/13.
 */
public class MutliThreadTest {


    public static void main(String[] args) {
        final JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://esbtest.leemanpaper.com/CustomerRelationshipManagement/CustomerComplaintsInfo/v001");
        //      jaxWsProxyFactoryBean.setAddress("http://172.23.3.86:9811/CustomerRelationshipManagement/CustomerComplaintsInfo/v001");
        Thread t1 = new Thread(){
            @Override
            public void run(){

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
                        System.out.println("Thread 1 :  " + "i: "+i+"  j: "+ j);
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
//      jaxWsProxyFactoryBean.setAddress("http://172.23.3.86:9811/CustomerRelationshipManagement/CustomerComplaintsInfo/v001");
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
                        System.out.println("Thread 2 :  " + "i: "+i+"  j: "+ j);
                    }
                }
            }
        };
        Thread t3 = new Thread(){
            @Override
            public void run(){
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
                        System.out.println("Thread 3 :  " + "i: "+i+"  j: "+ j);
                    }
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();


    }

}
