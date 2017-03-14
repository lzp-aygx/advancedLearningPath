package advancedPath.entity;

/**
 * Created by lizhupeng on 2016/12/29.
 */
public class SalesRegionChannel {
    private String CompanyId;
    private String ChannelId;
    private String RegionId;
    private String CSExecutive;
    private String CSExecutiveEamil;
    private String CSSupervisor;
    private String CSSupervisorEamil;
    private String CSManager;
    private String CSManagerEamil;

    public SalesRegionChannel() {
    }

    public SalesRegionChannel(String CSManagerEamil, String companyId, String channelId, String regionId, String CSExecutive, String CSExecutiveEamil, String CSSupervisor, String CSSupervisorEamil, String CSManager) {
        this.CSManagerEamil = CSManagerEamil;
        CompanyId = companyId;
        ChannelId = channelId;
        RegionId = regionId;
        this.CSExecutive = CSExecutive;
        this.CSExecutiveEamil = CSExecutiveEamil;
        this.CSSupervisor = CSSupervisor;
        this.CSSupervisorEamil = CSSupervisorEamil;
        this.CSManager = CSManager;
    }

    public String getCSManagerEamil() {
        return CSManagerEamil;
    }

    public void setCSManagerEamil(String CSManagerEamil) {
        this.CSManagerEamil = CSManagerEamil;
    }

    public String getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(String companyId) {
        CompanyId = companyId;
    }

    public String getChannelId() {
        return ChannelId;
    }

    public void setChannelId(String channelId) {
        ChannelId = channelId;
    }

    public String getRegionId() {
        return RegionId;
    }

    public void setRegionId(String regionId) {
        RegionId = regionId;
    }

    public String getCSExecutive() {
        return CSExecutive;
    }

    public void setCSExecutive(String CSExecutive) {
        this.CSExecutive = CSExecutive;
    }

    public String getCSExecutiveEamil() {
        return CSExecutiveEamil;
    }

    public void setCSExecutiveEamil(String CSExecutiveEamil) {
        this.CSExecutiveEamil = CSExecutiveEamil;
    }

    public String getCSSupervisor() {
        return CSSupervisor;
    }

    public void setCSSupervisor(String CSSupervisor) {
        this.CSSupervisor = CSSupervisor;
    }

    public String getCSSupervisorEamil() {
        return CSSupervisorEamil;
    }

    public void setCSSupervisorEamil(String CSSupervisorEamil) {
        this.CSSupervisorEamil = CSSupervisorEamil;
    }

    public String getCSManager() {
        return CSManager;
    }

    public void setCSManager(String CSManager) {
        this.CSManager = CSManager;
    }

    @Override
    public String toString() {
        return "SalesRegionChannel{" +
                "CompanyId='" + CompanyId + '\'' +
                ", ChannelId='" + ChannelId + '\'' +
                ", RegionId='" + RegionId + '\'' +
                ", CSExecutive='" + CSExecutive + '\'' +
                ", CSExecutiveEamil='" + CSExecutiveEamil + '\'' +
                ", CSSupervisor='" + CSSupervisor + '\'' +
                ", CSSupervisorEamil='" + CSSupervisorEamil + '\'' +
                ", CSManager='" + CSManager + '\'' +
                ", CSManagerEamil='" + CSManagerEamil + '\'' +
                '}';
    }
}
