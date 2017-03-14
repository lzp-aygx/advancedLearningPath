package advancedPath.service;

import org.springframework.beans.factory.annotation.Autowired;
import advancedPath.dao.SDMSDaoImpl;
import advancedPath.domain.RollInfoItem;

import javax.jws.WebService;

/**
 * Created by lizhupeng on 2017/3/9.
 */

@WebService(targetNamespace="http://service.advancedPath/",endpointInterface = "advancedPath.service.SDMSService")
public class SDMSServiceImpl implements SDMSService{

    @Autowired
    private SDMSDaoImpl sdmsDao;

    @Override
    public RollInfoItem findRollInfoItemByRollNo(String roolNo) {

        return sdmsDao.findRollInfoItemByRollNo(roolNo);
    }
}
