package ProjectTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import advancedPath.Application;
import advancedPath.controller.PaperController;
import advancedPath.entity.Paper;

/**
 * Created by lizhupeng on 2016/12/24.
 */
public class TestMybatis {


    public static void main(String[] args) throws Exception{
        //引用配置类,初始化一个上下文
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        //从上下文中获取bean实例
        PaperController paperController = context.getBean(PaperController.class);

        System.out.println(paperController.findPaperById(1));
        for(Paper ps:paperController.findPapers()){
            System.out.println(ps);
        }
    }
}
