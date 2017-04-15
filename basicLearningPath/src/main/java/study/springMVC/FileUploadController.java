package study.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

/**
 * Created by lizhupeng on 2017/4/15.
 */

@Controller
public class FileUploadController {

    @RequestMapping(value = "fileUpload", method = RequestMethod.POST)
    public void fileUpload(@RequestPart("profilePicture") byte[] profilePicture, String msg) {
    }
}
