package tissueComplaint.dao;


import tissueComplaint.entity.Answer;
import tissueComplaint.entity.EmailLog;
import tissueComplaint.entity.Paper;

import java.util.List;

/**
 * Created by lizhupeng on 2016/12/24.
 */
public interface BaseDataDao {
   //久系统paper表测试样例
   Paper findPaperById(int id);
   List<Paper> findPapers();

   //邮件记录表
   EmailLog findEmailLogById(String companyId, String complaintNo);
   List<EmailLog> findEmailLogs(String companyId);

   //根据公司编号查询问题表中的全部问题
   Answer findAnswers(String companyId);



}
