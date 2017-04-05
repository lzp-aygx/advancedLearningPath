import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import study.springMVC.IndexController;
import study.springMVC.SpringMVCContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by lizhupeng on 2017/1/12.
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMVCContext.class})
@WebAppConfiguration("src/main/resources")//
public class SpringMVCTest {

    @Test
    public void testNormalController() throws Exception {
        IndexController controller = new IndexController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }

    public void testMVCController() throws Exception{
        IndexController controller = new IndexController();
        MockMvc mockMvc =
                standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }

}
