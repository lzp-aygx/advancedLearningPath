package tissueComplaint.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import tissueComplaint.entity.Answer;
import tissueComplaint.entity.EmailLog;
import tissueComplaint.entity.Paper;
import tissueComplaint.util.MyBatisUtilDao;

import java.util.List;

/**
 * Created by lizhupeng on 2016/12/30.
 */
@Repository
public class BaseDataDaoImpl extends MyBatisUtilDao implements BaseDataDao {

    @Override
    public Paper findPaperById(int id) {
        SqlSession sqlSession = getSqlSession();
        BaseDataDao baseDataDao = sqlSession.getMapper(BaseDataDao.class);
        Paper paper = baseDataDao.findPaperById(id);
        sqlSession.close();
        return paper;
    }

    @Override
    public List<Paper> findPapers() {
        SqlSession sqlSession = getSqlSession();
        BaseDataDao baseDataDao = sqlSession.getMapper(BaseDataDao.class);
        List<Paper> papers = baseDataDao.findPapers();
        sqlSession.close();
        return papers;
    }

    @Override
    public EmailLog findEmailLogById(String companyId, String complaintNo) {
        SqlSession sqlSession = getSqlSession();
        BaseDataDao baseDataDao = sqlSession.getMapper(BaseDataDao.class);
        EmailLog emailLog = baseDataDao.findEmailLogById(companyId,complaintNo);
        sqlSession.close();
        return emailLog;
    }

    @Override
    public List<EmailLog> findEmailLogs(String companyId) {
        SqlSession sqlSession = getSqlSession();
        BaseDataDao baseDataDao = sqlSession.getMapper(BaseDataDao.class);
        List<EmailLog> emailLogs = baseDataDao.findEmailLogs(companyId);
        sqlSession.close();
        return emailLogs;
    }

    @Override
    public Answer findAnswers(String companyId) {
        SqlSession sqlSession = getSqlSession();
        BaseDataDao baseDataDao = sqlSession.getMapper(BaseDataDao.class);
        Answer answers = baseDataDao.findAnswers(companyId);
        sqlSession.close();
        return answers;
    }
}
