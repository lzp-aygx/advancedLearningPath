package advancedPath.entity;

/**
 * Created by lizhupeng on 2016/12/29.
 */
public class Department {
    private String CompanyId;
    private String DepartmentId;
    private String FollowUpPerson;
    private String FollowUpPersonEmail;
    private String ResponsiblePerson;
    private String ResponsiblePersonEmail;
    private String ApprovalPerson;
    private String ApprovalPersonEmail;

    public Department() {
    }

    public Department(String companyId, String departmentId, String followUpPerson, String followUpPersonEmail, String responsiblePerson, String responsiblePersonEmail, String approvalPerson, String approvalPersonEmail) {
        CompanyId = companyId;
        DepartmentId = departmentId;
        FollowUpPerson = followUpPerson;
        FollowUpPersonEmail = followUpPersonEmail;
        ResponsiblePerson = responsiblePerson;
        ResponsiblePersonEmail = responsiblePersonEmail;
        ApprovalPerson = approvalPerson;
        ApprovalPersonEmail = approvalPersonEmail;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }

    public String getFollowUpPerson() {
        return FollowUpPerson;
    }

    public void setFollowUpPerson(String followUpPerson) {
        FollowUpPerson = followUpPerson;
    }

    public String getFollowUpPersonEmail() {
        return FollowUpPersonEmail;
    }

    public void setFollowUpPersonEmail(String followUpPersonEmail) {
        FollowUpPersonEmail = followUpPersonEmail;
    }

    public String getResponsiblePerson() {
        return ResponsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        ResponsiblePerson = responsiblePerson;
    }

    public String getResponsiblePersonEmail() {
        return ResponsiblePersonEmail;
    }

    public void setResponsiblePersonEmail(String responsiblePersonEmail) {
        ResponsiblePersonEmail = responsiblePersonEmail;
    }

    public String getApprovalPerson() {
        return ApprovalPerson;
    }

    public void setApprovalPerson(String approvalPerson) {
        ApprovalPerson = approvalPerson;
    }

    public String getApprovalPersonEmail() {
        return ApprovalPersonEmail;
    }

    public void setApprovalPersonEmail(String approvalPersonEmail) {
        ApprovalPersonEmail = approvalPersonEmail;
    }

    @Override
    public String toString() {
        return "Department{" +
                "CompanyId='" + CompanyId + '\'' +
                ", DepartmentId='" + DepartmentId + '\'' +
                ", FollowUpPerson='" + FollowUpPerson + '\'' +
                ", FollowUpPersonEmail='" + FollowUpPersonEmail + '\'' +
                ", ResponsiblePerson='" + ResponsiblePerson + '\'' +
                ", ResponsiblePersonEmail='" + ResponsiblePersonEmail + '\'' +
                ", ApprovalPerson='" + ApprovalPerson + '\'' +
                ", ApprovalPersonEmail='" + ApprovalPersonEmail + '\'' +
                '}';
    }
}
