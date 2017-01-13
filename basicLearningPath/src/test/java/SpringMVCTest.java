import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import study.springMVC.HelloController;
import study.springMVC.SpringMVCContext;

/**
 * Created by lizhupeng on 2017/1/12.
 */



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringMVCContext.class})
@WebAppConfiguration("src/main/resources")//
public class SpringMVCTest {
    private MockMvc mockMvc;

    @Autowired
    private HelloController helloController;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;

    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    public void testNormalController(){

    }

}
