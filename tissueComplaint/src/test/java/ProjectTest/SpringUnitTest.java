package ProjectTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tissueComplaint.Application;
import tissueComplaint.controller.PaperController;
import tissueComplaint.entity.Paper;

/**
 * Created by lizhupeng on 2017/1/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class SpringUnitTest extends AbstractJUnit4SpringContextTests{

    @Autowired
    private PaperController paperController;

    @Test
    public void test() {
        for(Paper ps:paperController.findPapers()){
            System.out.println(ps);
        }

    }

}
