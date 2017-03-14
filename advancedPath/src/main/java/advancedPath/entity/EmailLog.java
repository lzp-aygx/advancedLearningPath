package advancedPath.entity;

import java.util.Date;

/**
 * Created by lizhupeng on 2016/12/29.
 */
public class EmailLog {
    private String CompanyId;
    private String ComplaintNo;
    private String DepartmentId;
    private String EmailStatus;
    private String EmailTo;
    private String EmailToAddress;
    private Date EmailDateTime;

    public EmailLog() {
    }

    public EmailLog(Date emailDateTime, String companyId, String complaintNo, String departmentId, String emailStatus, String emailTo, String emailToAddress) {
        EmailDateTime = emailDateTime;
        CompanyId = companyId;
        ComplaintNo = complaintNo;
        DepartmentId = departmentId;
        EmailStatus = emailStatus;
        EmailTo = emailTo;
        EmailToAddress = emailToAddress;
    }

    public Date getEmailDateTime() {
        return EmailDateTime;
    }

    public void setEmailDateTime(Date emailDateTime) {
        EmailDateTime = emailDateTime;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getComplaintNo() {
        return ComplaintNo;
    }

    public void setComplaintNo(String complaintNo) {
        ComplaintNo = complaintNo;
    }

    public String getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(String departmentId) {
        DepartmentId = departmentId;
    }

    public String getEmailStatus() {
        return EmailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        EmailStatus = emailStatus;
    }

    public String getEmailTo() {
        return EmailTo;
    }

    public void setEmailTo(String emailTo) {
        EmailTo = emailTo;
    }

    public String getEmailToAddress() {
        return EmailToAddress;
    }

    public void setEmailToAddress(String emailToAddress) {
        EmailToAddress = emailToAddress;
    }

    @Override
    public String toString() {
        return "EmailLogInterfacae{" +
                "CompanyId='" + CompanyId + '\'' +
                ", ComplaintNo='" + ComplaintNo + '\'' +
                ", DepartmentId='" + DepartmentId + '\'' +
                ", EmailStatus='" + EmailStatus + '\'' +
                ", EmailTo='" + EmailTo + '\'' +
                ", EmailToAddress='" + EmailToAddress + '\'' +
                ", EmailDateTime=" + EmailDateTime +
                '}';
    }
}
