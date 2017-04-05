package study.springAdvancedFeatures.aop;

import org.springframework.stereotype.Component;

/**
 * Created by lizhupeng on 2017/3/21.
 */
@Component
public class Performance {
    public void perform(String actor, int num) {
//        测试异常情况下切面的运行
//        System.out.println(1/0);
        System.out.println("表演者:" + actor + "  演唱歌曲:" + num + "首");
    }
}
