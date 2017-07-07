package advancedPath.controller;

import advancedPath.dao.BaseDataDaoImpl;
import advancedPath.entity.Paper;
import advancedPath.util.CommonResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lizhupeng on 2016/12/24.
 */

@RestController
@RequestMapping(value = "/paper")
public class PaperController {

    @Autowired
    private BaseDataDaoImpl baseDataDaoImpl;

    @ApiOperation(value = "根据id查询纸种")
    @RequestMapping(value = "/findPaperById/{id}",method = RequestMethod.GET)
    public Paper findPaperById(@PathVariable int id) {
        return baseDataDaoImpl.findPaperById(id);
    }

    @ApiOperation(value = "查询全部纸种")
    @RequestMapping(value = "/findPapers" , method = RequestMethod.GET)
    public List<Paper> findPapers() {
        return baseDataDaoImpl.findPapers();
    }

    @RequestMapping(value = "/insertPaper",method = RequestMethod.POST)
    public CommonResponse insertPaper(@RequestBody Paper paper) {
        System.out.println(paper);
        CommonResponse commonResponse = new CommonResponse();
        commonResponse.setResultCode("1");
        commonResponse.setResultMessage("Success");
        return commonResponse;
    }
}
