package study.CXF;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by lizhupeng on 2016/6/24.
 */
/*CXF有两个工厂类创建本地代理服务:JaxWsProxyFactoryBean和JaxWsDynamicClientFactory*/

public class TestClient {
    //使用CXF工具wsdl2java为ESB暴露出来的QCReportManagement服务接口生成本地服务类,
    //然后创建CXF自带的一个工厂类JaxWsProxyFactoryBean,并指定WebService的地址和接口类后创建本地的代理服务
    /*测试ESB发布出来的WebService
    public static void main(String[] args) throws DefaultFault {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //address为远端服务wsdl发布地址.
        jaxWsProxyFactoryBean.setAddress("http://localhost:9843/WastePaperManagement/QualityControl/QCReportManagement/v001");
        //serviceClass为本地代理的接口类
        jaxWsProxyFactoryBean.setServiceClass(QCReportManagement.class);
        QCReportManagement qcReportManagement= (QCReportManagement) jaxWsProxyFactoryBean.create();
        GetQCReport getQCReport = new GetQCReport();
        getQCReport.setQCNo("75494058-01");
        getQCReport.setCompanyId("GDLM");
        RequestHeaderType requestHeaderType = new RequestHeaderType();
        requestHeaderType.setSourceID("");
        String result = qcReportManagement.getQCReport(getQCReport,requestHeaderType).getQCReport().getSupplierId();
        System.out.println(result);
    }*/
    /*使用JaxWsDynamicClientFactory工厂类来调用远端的WebService*/
    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client=clientFactory.createClient("http://localhost:8080/learningPath/webService/HelloWorldService?wsdl");
        Object[] result = client.invoke("sayHello","东莞");
        for(int i=0; i<result.length;i++) {
            System.out.println(result[i]);
        }

    }


    /*不整合Spring测试公网上提供的.net发布的webService天气查询的服务
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("/WeatherWebService.wsdl");
        jaxWsProxyFactoryBean.setServiceClass(WeatherWebServiceSoap.class);
        WeatherWebServiceSoap weatherWebServiceSoap = (WeatherWebServiceSoap) jaxWsProxyFactoryBean.create();
        ArrayOfString str = weatherWebServiceSoap.getWeatherbyCityName("东莞");
        System.out.println(str);
    }
    */

    /*整合Spring调用服务
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldName helloWorldClient = (HelloWorldName) applicationContext.getBean("helloWorldClient");
        String result = helloWorldClient.sayHello("lzp");
        System.out.println(result);
    }*/

    /*wsdl2java生成.net发布的WebService 的时候会产生如下异常:undefined element declaration 's:schema'
    将远端的wsdl文件保存到本地之后将wsdl文<s:any minOccurs="2" maxOccurs="2"/>代替<s:element ref="s:schema" /><s:any />
    然后重新用wsdl2java方法将本地的wsdl文件重新解析.后测试成功
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?Wsdl");
        jaxWsProxyFactoryBean.setServiceClass(WeatherWSSoap.class);
        WeatherWSSoap weatherWSSoap = (WeatherWSSoap) jaxWsProxyFactoryBean.create();
        ArrayOfString str = weatherWSSoap.getRegionCountry();
        System.out.println(str.getString());
    }*/
}
