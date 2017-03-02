package tissueComplaint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tissueComplaint.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lizhupeng on 2017/2/20.
 */



@Controller
public class TemplateTest {
    @RequestMapping("/template")
    public String template(Model model){
        Person single = new Person("lizhupeng",25);
        List<Person> persons = new ArrayList<Person>();
        Person p1 = new Person("黎明",50);
        Person p2 = new Person("张学友",51);
        Person p3 = new Person("郭富城",52);
        Person p4 = new Person("刘德华",53);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        model.addAttribute("singlePerson",single);
        model.addAttribute("persons",persons);
        return "thymeleaf";
    }

}
