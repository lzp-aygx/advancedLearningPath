package tissueComplaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tissueComplaint.domain.TestPropertiesClass;

/**
 * Created by lizhupeng on 2017/1/12.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestPropertiesClass testPropertiesClass;

    @RequestMapping(value = "/getPropertiesByValue")
    String testGetPropertiesByValue() {
        return "Author:" + testPropertiesClass.getAuthor() + "  Name:" + testPropertiesClass.getName();
    }

    @RequestMapping(value = "/getPropertiesByPropertiesClass")
    TestPropertiesClass testGetPropertiesByPropertiesClass() {
        return testPropertiesClass;
    }
}
