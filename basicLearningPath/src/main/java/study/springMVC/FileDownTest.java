package study.springMVC;

import org.aspectj.util.FileUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;

/**
 * Created by lizhupeng on 2017/10/30.
 */

@Controller
public class FileDownTest {


    @RequestMapping("/filetest/down")
    @ResponseBody
    public ResponseEntity<byte[]> getMessageImage() throws IOException {
        File file = new File("E:\\IdeaWorkSpace\\LeemanHRWeb\\src\\main\\resources\\static\\images\\error.jpg");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        ResponseEntity<byte[]> result = new ResponseEntity<byte[]>(FileUtil.readAsByteArray(file), headers,HttpStatus.OK);
        return result;
    }


//    @RequestMapping("/filetest/down1")
//    public void getImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        ServletOutputStream out = null;
//        try {
//            response.reset();
//            response.setContentType(MediaType.APPLICATION_PDF.toString());
//            List<PSAttachment> files = lmCommonMapper.getAttachment("f09e996b-246f-11e5-8544-ced52d31f0f4/LM004949.pdf");
//            out = response.getOutputStream();
//            for (PSAttachment psFile : files){
//                out.write(psFile.getFile_data());
//            }
//            out.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
