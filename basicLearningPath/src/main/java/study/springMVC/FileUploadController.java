package study.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by lizhupeng on 2017/4/15.
 */

@Controller
public class FileUploadController {

    @RequestMapping(value = "/fileUploadController", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("profilePicture") MultipartFile profilePicture,Model model) throws Exception{
            System.out.println("Name:"+profilePicture.getName());
            System.out.println("ContentType:"+profilePicture.getContentType());
            System.out.println("OriginalFilename:"+profilePicture.getOriginalFilename());
            System.out.println("Size:"+profilePicture.getSize());
            System.out.println("Bytes:"+profilePicture.getBytes());
            System.out.println("InputStream:"+profilePicture.getInputStream());
            profilePicture.transferTo(new File("E:\\IdeaWorkSpace\\fileUpload\\test.jpg"));
            model.addAttribute("msg","Upload success");
            return "index";
    }
}
