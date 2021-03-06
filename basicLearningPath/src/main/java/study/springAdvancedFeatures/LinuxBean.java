package study.springAdvancedFeatures;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by lizhupeng on 2017/1/10.
 */

@Component
@Conditional(LinuxCondition.class)
class LinuxBean implements ConditionServiceInterface{
    public String showBeanName() {
        return "Linux";
    }
}
