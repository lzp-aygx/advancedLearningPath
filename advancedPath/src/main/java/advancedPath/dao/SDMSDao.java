package advancedPath.dao;


import advancedPath.domain.RollInfo;
import advancedPath.domain.RollInfoItem;

import java.util.List;

/**
 * Created by lizhupeng on 2016/12/24.
 */
public interface SDMSDao {

    List<RollInfo> findRollInfos();
    RollInfoItem findRollInfoItemByRollNo(String roolNo);

}
