package study.springMVC;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lizhupeng on 2017/4/15.
 */

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUploadController", method = RequestMethod.POST)
    public @ResponseBody String fileUpload(MultipartFile profilePicture) {

        try {
            FileUtils.writeByteArrayToFile(
                    new File("E:/fileUpload" + profilePicture.getOriginalFilename()),profilePicture.getBytes()
            );
            return "Ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "Wrong";
        }

    }
}
