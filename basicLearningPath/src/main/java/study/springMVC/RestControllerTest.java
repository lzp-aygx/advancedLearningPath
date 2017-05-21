package study.springMVC;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springMVC.entity.Product;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by lizhupeng on 2017/5/19.
 */
/**相当于@Controller和@ResponseBody的组合,
 *另外可以在普通的Controller的方法级别上添加@ResponseBody*/
@RestController
@RequestMapping("/api")
public class RestControllerTest {

    @RequestMapping(value = "/production", method = GET ,produces = "application/json;charset=UTF-8")
    public Product getProduction (Model model){
        Product p1 = new Product();
        p1.setCompanyId("leeman");
        p1.setProductCategory("heihei");
        return p1;
    }
}
