package tissueComplaint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tissueComplaint.dao.BaseDataDaoImpl;
import tissueComplaint.entity.Paper;
import tissueComplaint.util.CommonResponse;

import java.util.List;

/**
 * Created by lizhupeng on 2016/12/24.
 */

@RestController
@RequestMapping(value = "/Paper")
public class PaperController {

    @Autowired
    private BaseDataDaoImpl baseDataDaoImpl;

    @RequestMapping(value = "/findPaperById/{id}",method = RequestMethod.GET)
    public Paper findPaperById(@PathVariable int id) {
        return baseDataDaoImpl.findPaperById(id);
    }

    @RequestMapping(value = "/findPapers" , method = RequestMethod.GET)
    public List<Paper> findPapers() {
        return baseDataDaoImpl.findPapers();
    }

    @RequestMapping(value = "/insertPaper")
    public CommonResponse insertPaper(Paper paper) {
        System.out.println(paper);
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setResultCode("1");
        commonResponse.setResultMessage("Success");
        return commonResponse;
    }
}
