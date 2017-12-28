package advancedPath.springBootStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by lizhupeng on 2017/12/18.
 */

@Component
public class RedisTest {


    private StringRedisTemplate template;

    @Autowired
    public RedisTest(StringRedisTemplate template) {
        this.template = template;
    }


    public boolean putAttr (String key,String value){


        return true;
    }




}
