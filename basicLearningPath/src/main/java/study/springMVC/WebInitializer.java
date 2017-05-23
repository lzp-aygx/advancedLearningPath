package study.springMVC;

/**
 * Created by lizhupeng on 2017/1/11.
 */


import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import study.springAdvancedFeatures.SpringAdvancedFeaturesContext;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Web配置类,是Spring提供用来配置Servlet3.0+配置的接口,从而实现了代替web.xml的位置.
 * 在Servlet3.0规范中,Servlet容器会自动的将实现了ServletContainerInitializer的类当做配置类来配置Servlet
 * 然后在Spring3.1之后,Spring提供了一个ServletContainerInitializer的实现类SpringServletContainerInitializer
 * 这个Spring提供的实现类,会自动扫面类路径下实现了WebApplicationInitializer接口的配置类.
 * 为了方便用户使用Spring定义了一个基础配置类
 * AbstractAnnotationConfigDispatcherServletInitializer这个类实现了WebApplicationInitializer接口
 * 继承这个类,然后只需要重写下面三个方法.
 */

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private final int fileMAXSize = 2097152;

    private final int multipartMAXSize = 4194304;

    private final int fileUploadWriteSize = 0;

    //由ContextLoaderListener加载应用上下文
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{SpringAdvancedFeaturesContext.class};
    }

    //加载Web相关配置文件,并且引入Web组件,如控制器、视图解析器、映射
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringMVCContext.class};
    }

    //指定DispatcherServlet的映射地址
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }

    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        //为DispatcherServlet配置multipart解析器,其中解析器的构造函数的参数分别为:
        //1.临时目录,2.单个上传文件的最大容量
        //3.整个multipart请求的最大总容量,4.上传过程中写入临时目录的开始大小
        registration.setMultipartConfig(
                new MultipartConfigElement("E:\\IdeaWorkSpace\\fileUpload\\", fileMAXSize, multipartMAXSize, fileUploadWriteSize)
        );
    }

    protected Filter[] getServletFilters(){
        //配置编码过去器
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[] {characterEncodingFilter};
    }
}
