import mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by lizhupeng on 2017/9/21.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringSecurityLearningPath.class)
public class testUserInfo {

    @Resource
    UserInfoMapper userInfoMapper;


    @Test
    public void contextLoads()  {
        System.out.println(userInfoMapper.getUserInfoById(1));
    }
}
