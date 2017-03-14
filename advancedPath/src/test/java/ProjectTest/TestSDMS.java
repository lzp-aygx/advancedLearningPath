package ProjectTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import advancedPath.Application;
import advancedPath.service.SDMSServiceImpl;

/**
 * Created by lizhupeng on 2017/3/9.
 */
public class TestSDMS {

    public static void main(String[] args) throws Exception{
        //引用配置类,初始化一个上下文
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        //从上下文中获取bean实例
        SDMSServiceImpl sdmsDao = context.getBean(SDMSServiceImpl.class);

        System.out.println(sdmsDao.findRollInfoItemByRollNo("GDLM001"));
    }
}
