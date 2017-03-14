package advancedPath.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import advancedPath.domain.RollInfo;
import advancedPath.domain.RollInfoItem;
import advancedPath.util.MyBatisUtilDaoSDMS;

import java.util.List;

/**
 * Created by lizhupeng on 2017/3/9.
 */
@Repository
public class SDMSDaoImpl  extends MyBatisUtilDaoSDMS implements SDMSDao{

    @Override
    public List<RollInfo> findRollInfos() {
        SqlSession sqlSession = getSqlSession();
        SDMSDao sdmsDao = sqlSession.getMapper(SDMSDao.class);
        List<RollInfo> rollInfos = sdmsDao.findRollInfos();
        sqlSession.close();
        return rollInfos;
    }

    @Override
    public RollInfoItem findRollInfoItemByRollNo(String roolNo) {
        SqlSession sqlSession = getSqlSession();
        SDMSDao sdmsDao = sqlSession.getMapper(SDMSDao.class);
        RollInfoItem rollInfoItem = sdmsDao.findRollInfoItemByRollNo(roolNo);
        sqlSession.close();
        return rollInfoItem;
    }
}
