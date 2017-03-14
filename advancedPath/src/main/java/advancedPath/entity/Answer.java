package advancedPath.entity;


/**
 * Created by lizhupeng on 2016/12/30.
 */

public class Answer {
    private String CompanyId;
    private String AnswerId;
    private String AnswerType;
    private String AnswerDescribe;
    private String AnswerExplication;
    private String AttributionDepartmentId;
    private String AnswerSolution;

    public Answer() {
    }

    public Answer(String answerSolution, String companyId, String answerId, String answerType, String answerDescribe, String answerExplication, String attributionDepartmentId) {
        AnswerSolution = answerSolution;
        CompanyId = companyId;
        AnswerId = answerId;
        AnswerType = answerType;
        AnswerDescribe = answerDescribe;
        AnswerExplication = answerExplication;
        AttributionDepartmentId = attributionDepartmentId;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getAnswerId() {
        return AnswerId;
    }

    public void setAnswerId(String answerId) {
        AnswerId = answerId;
    }

    public String getAnswerType() {
        return AnswerType;
    }

    public void setAnswerType(String answerType) {
        AnswerType = answerType;
    }

    public String getAnswerDescribe() {
        return AnswerDescribe;
    }

    public void setAnswerDescribe(String answerDescribe) {
        AnswerDescribe = answerDescribe;
    }

    public String getAnswerExplication() {
        return AnswerExplication;
    }

    public void setAnswerExplication(String answerExplication) {
        AnswerExplication = answerExplication;
    }

    public String getAttributionDepartmentId() {
        return AttributionDepartmentId;
    }

    public void setAttributionDepartmentId(String attributionDepartmentId) {
        AttributionDepartmentId = attributionDepartmentId;
    }

    public String getAnswerSolution() {
        return AnswerSolution;
    }

    public void setAnswerSolution(String answerSolution) {
        AnswerSolution = answerSolution;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "CompanyId='" + CompanyId + '\'' +
                ", AnswerId='" + AnswerId + '\'' +
                ", AnswerType='" + AnswerType + '\'' +
                ", AnswerDescribe='" + AnswerDescribe + '\'' +
                ", AnswerExplication='" + AnswerExplication + '\'' +
                ", AttributionDepartmentId='" + AttributionDepartmentId + '\'' +
                ", AnswerSolution='" + AnswerSolution + '\'' +
                '}';
    }
}
