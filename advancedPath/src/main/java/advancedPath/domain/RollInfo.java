package advancedPath.domain;

/**
 * Created by lizhupeng on 2017/3/9.
 */
public class RollInfo {
    private String COMPANY_ID;
    private String FACTORY_ID;
    private String MODIFY_APPLY_ID;
    private String STATUS;
    private String APPROVAL_DTTM;
    private String APPROVAL_BY;
    private String LAST_MODIFY_DTTM;
    private String LAST_MODIFY_BY;
    private String RESPONSIBILITY_DEPT;
    private String CHG_WHS_NO;
    private String NEED_FINANCIAL_FLAG;
    private String PLAN_FINISH_DATE;
    private String APPROVA_ADIVICE;
    private String MODIFY_APPLY_TYPE;


    public RollInfo(){};

    public RollInfo(String COMPANY_ID, String FACTORY_ID, String MODIFY_APPLY_ID, String STATUS, String APPROVAL_DTTM, String APPROVAL_BY, String LAST_MODIFY_DTTM, String LAST_MODIFY_BY, String RESPONSIBILITY_DEPT, String CHG_WHS_NO, String NEED_FINANCIAL_FLAG, String PLAN_FINISH_DATE, String APPROVA_ADIVICE, String MODIFY_APPLY_TYPE) {
        this.COMPANY_ID = COMPANY_ID;
        this.FACTORY_ID = FACTORY_ID;
        this.MODIFY_APPLY_ID = MODIFY_APPLY_ID;
        this.STATUS = STATUS;
        this.APPROVAL_DTTM = APPROVAL_DTTM;
        this.APPROVAL_BY = APPROVAL_BY;
        this.LAST_MODIFY_DTTM = LAST_MODIFY_DTTM;
        this.LAST_MODIFY_BY = LAST_MODIFY_BY;
        this.RESPONSIBILITY_DEPT = RESPONSIBILITY_DEPT;
        this.CHG_WHS_NO = CHG_WHS_NO;
        this.NEED_FINANCIAL_FLAG = NEED_FINANCIAL_FLAG;
        this.PLAN_FINISH_DATE = PLAN_FINISH_DATE;
        this.APPROVA_ADIVICE = APPROVA_ADIVICE;
        this.MODIFY_APPLY_TYPE = MODIFY_APPLY_TYPE;
    }

    public String getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(String COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public String getFACTORY_ID() {
        return FACTORY_ID;
    }

    public void setFACTORY_ID(String FACTORY_ID) {
        this.FACTORY_ID = FACTORY_ID;
    }

    public String getMODIFY_APPLY_ID() {
        return MODIFY_APPLY_ID;
    }

    public void setMODIFY_APPLY_ID(String MODIFY_APPLY_ID) {
        this.MODIFY_APPLY_ID = MODIFY_APPLY_ID;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getAPPROVAL_DTTM() {
        return APPROVAL_DTTM;
    }

    public void setAPPROVAL_DTTM(String APPROVAL_DTTM) {
        this.APPROVAL_DTTM = APPROVAL_DTTM;
    }

    public String getAPPROVAL_BY() {
        return APPROVAL_BY;
    }

    public void setAPPROVAL_BY(String APPROVAL_BY) {
        this.APPROVAL_BY = APPROVAL_BY;
    }

    public String getLAST_MODIFY_DTTM() {
        return LAST_MODIFY_DTTM;
    }

    public void setLAST_MODIFY_DTTM(String LAST_MODIFY_DTTM) {
        this.LAST_MODIFY_DTTM = LAST_MODIFY_DTTM;
    }

    public String getLAST_MODIFY_BY() {
        return LAST_MODIFY_BY;
    }

    public void setLAST_MODIFY_BY(String LAST_MODIFY_BY) {
        this.LAST_MODIFY_BY = LAST_MODIFY_BY;
    }

    public String getRESPONSIBILITY_DEPT() {
        return RESPONSIBILITY_DEPT;
    }

    public void setRESPONSIBILITY_DEPT(String RESPONSIBILITY_DEPT) {
        this.RESPONSIBILITY_DEPT = RESPONSIBILITY_DEPT;
    }

    public String getCHG_WHS_NO() {
        return CHG_WHS_NO;
    }

    public void setCHG_WHS_NO(String CHG_WHS_NO) {
        this.CHG_WHS_NO = CHG_WHS_NO;
    }

    public String getNEED_FINANCIAL_FLAG() {
        return NEED_FINANCIAL_FLAG;
    }

    public void setNEED_FINANCIAL_FLAG(String NEED_FINANCIAL_FLAG) {
        this.NEED_FINANCIAL_FLAG = NEED_FINANCIAL_FLAG;
    }

    public String getPLAN_FINISH_DATE() {
        return PLAN_FINISH_DATE;
    }

    public void setPLAN_FINISH_DATE(String PLAN_FINISH_DATE) {
        this.PLAN_FINISH_DATE = PLAN_FINISH_DATE;
    }

    public String getAPPROVA_ADIVICE() {
        return APPROVA_ADIVICE;
    }

    public void setAPPROVA_ADIVICE(String APPROVA_ADIVICE) {
        this.APPROVA_ADIVICE = APPROVA_ADIVICE;
    }

    public String getMODIFY_APPLY_TYPE() {
        return MODIFY_APPLY_TYPE;
    }

    public void setMODIFY_APPLY_TYPE(String MODIFY_APPLY_TYPE) {
        this.MODIFY_APPLY_TYPE = MODIFY_APPLY_TYPE;
    }

    @Override
    public String toString() {
        return "RollInfo{" +
                "COMPANY_ID='" + COMPANY_ID + '\'' +
                ", FACTORY_ID='" + FACTORY_ID + '\'' +
                ", MODIFY_APPLY_ID='" + MODIFY_APPLY_ID + '\'' +
                ", STATUS='" + STATUS + '\'' +
                ", APPROVAL_DTTM='" + APPROVAL_DTTM + '\'' +
                ", APPROVAL_BY='" + APPROVAL_BY + '\'' +
                ", LAST_MODIFY_DTTM='" + LAST_MODIFY_DTTM + '\'' +
                ", LAST_MODIFY_BY='" + LAST_MODIFY_BY + '\'' +
                ", RESPONSIBILITY_DEPT='" + RESPONSIBILITY_DEPT + '\'' +
                ", CHG_WHS_NO='" + CHG_WHS_NO + '\'' +
                ", NEED_FINANCIAL_FLAG='" + NEED_FINANCIAL_FLAG + '\'' +
                ", PLAN_FINISH_DATE='" + PLAN_FINISH_DATE + '\'' +
                ", APPROVA_ADIVICE='" + APPROVA_ADIVICE + '\'' +
                ", MODIFY_APPLY_TYPE='" + MODIFY_APPLY_TYPE + '\'' +
                '}';
    }
}
