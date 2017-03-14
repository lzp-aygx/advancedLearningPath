package advancedPath.domain;

/**
 * Created by lizhupeng on 2017/3/9.
 */
public class RollInfoItem {
    private String COMPANY_ID;
    private String FACTORY_ID;
    private String MODIFY_APPLY_ID;
    private String ORI_ROLL_NO;
    private String ITEM_NO;
    private String ORI_PAPER_TYPE;
    private String ORI_PAPER_SIZE;
    private String ORI_UOM;
    private String ORI_WEIGHT;
    private String PRODUCTION_DATE;
    private String STOCK_IN_DATE;
    private String MACHINE_ID;
    private String WAREHOUSE;
    private String FLAT_SHEET;
    private String ORI_SPECIFICATION;
    private String ORI_REAM_QTY;
    private String ORI_QTY;
    private String NEW_ROLL_NO;
    private String PAPER_TYPE;
    private String PAPER_SIZE;
    private String UOM;
    private String SPECIFICATION;
    private String REAM_QTY;
    private String QTY;
    private String QC_PAPER_SIZE;
    private String WEIGHT;
    private String STATUS;
    private String CONCLUSION;
    private String NEED_FINANCIAL_FLAG;
    private String NEED_DISPOSE_FLAG;
    private String REMARK;
    private String POST_FLAG;

    public RollInfoItem() {
    }

    public RollInfoItem(String COMPANY_ID, String FACTORY_ID, String MODIFY_APPLY_ID, String ORI_ROLL_NO, String ITEM_NO, String ORI_PAPER_TYPE, String ORI_PAPER_SIZE, String ORI_UOM, String ORI_WEIGHT, String PRODUCTION_DATE, String STOCK_IN_DATE, String MACHINE_ID, String WAREHOUSE, String FLAT_SHEET, String ORI_SPECIFICATION, String ORI_REAM_QTY, String ORI_QTY, String NEW_ROLL_NO, String PAPER_TYPE, String PAPER_SIZE, String UOM, String SPECIFICATION, String REAM_QTY, String QTY, String QC_PAPER_SIZE, String WEIGHT, String STATUS, String CONCLUSION, String NEED_FINANCIAL_FLAG, String NEED_DISPOSE_FLAG, String REMARK, String POST_FLAG) {
        this.COMPANY_ID = COMPANY_ID;
        this.FACTORY_ID = FACTORY_ID;
        this.MODIFY_APPLY_ID = MODIFY_APPLY_ID;
        this.ORI_ROLL_NO = ORI_ROLL_NO;
        this.ITEM_NO = ITEM_NO;
        this.ORI_PAPER_TYPE = ORI_PAPER_TYPE;
        this.ORI_PAPER_SIZE = ORI_PAPER_SIZE;
        this.ORI_UOM = ORI_UOM;
        this.ORI_WEIGHT = ORI_WEIGHT;
        this.PRODUCTION_DATE = PRODUCTION_DATE;
        this.STOCK_IN_DATE = STOCK_IN_DATE;
        this.MACHINE_ID = MACHINE_ID;
        this.WAREHOUSE = WAREHOUSE;
        this.FLAT_SHEET = FLAT_SHEET;
        this.ORI_SPECIFICATION = ORI_SPECIFICATION;
        this.ORI_REAM_QTY = ORI_REAM_QTY;
        this.ORI_QTY = ORI_QTY;
        this.NEW_ROLL_NO = NEW_ROLL_NO;
        this.PAPER_TYPE = PAPER_TYPE;
        this.PAPER_SIZE = PAPER_SIZE;
        this.UOM = UOM;
        this.SPECIFICATION = SPECIFICATION;
        this.REAM_QTY = REAM_QTY;
        this.QTY = QTY;
        this.QC_PAPER_SIZE = QC_PAPER_SIZE;
        this.WEIGHT = WEIGHT;
        this.STATUS = STATUS;
        this.CONCLUSION = CONCLUSION;
        this.NEED_FINANCIAL_FLAG = NEED_FINANCIAL_FLAG;
        this.NEED_DISPOSE_FLAG = NEED_DISPOSE_FLAG;
        this.REMARK = REMARK;
        this.POST_FLAG = POST_FLAG;
    }

    @Override
    public String toString() {
        return "RollInfoItem{" +
                "COMPANY_ID='" + COMPANY_ID + '\'' +
                ", FACTORY_ID='" + FACTORY_ID + '\'' +
                ", MODIFY_APPLY_ID='" + MODIFY_APPLY_ID + '\'' +
                ", ORI_ROLL_NO='" + ORI_ROLL_NO + '\'' +
                ", ITEM_NO='" + ITEM_NO + '\'' +
                ", ORI_PAPER_TYPE='" + ORI_PAPER_TYPE + '\'' +
                ", ORI_PAPER_SIZE='" + ORI_PAPER_SIZE + '\'' +
                ", ORI_UOM='" + ORI_UOM + '\'' +
                ", ORI_WEIGHT='" + ORI_WEIGHT + '\'' +
                ", PRODUCTION_DATE='" + PRODUCTION_DATE + '\'' +
                ", STOCK_IN_DATE='" + STOCK_IN_DATE + '\'' +
                ", MACHINE_ID='" + MACHINE_ID + '\'' +
                ", WAREHOUSE='" + WAREHOUSE + '\'' +
                ", FLAT_SHEET='" + FLAT_SHEET + '\'' +
                ", ORI_SPECIFICATION='" + ORI_SPECIFICATION + '\'' +
                ", ORI_REAM_QTY='" + ORI_REAM_QTY + '\'' +
                ", ORI_QTY='" + ORI_QTY + '\'' +
                ", NEW_ROLL_NO='" + NEW_ROLL_NO + '\'' +
                ", PAPER_TYPE='" + PAPER_TYPE + '\'' +
                ", PAPER_SIZE='" + PAPER_SIZE + '\'' +
                ", UOM='" + UOM + '\'' +
                ", SPECIFICATION='" + SPECIFICATION + '\'' +
                ", REAM_QTY='" + REAM_QTY + '\'' +
                ", QTY='" + QTY + '\'' +
                ", QC_PAPER_SIZE='" + QC_PAPER_SIZE + '\'' +
                ", WEIGHT='" + WEIGHT + '\'' +
                ", STATUS='" + STATUS + '\'' +
                ", CONCLUSION='" + CONCLUSION + '\'' +
                ", NEED_FINANCIAL_FLAG='" + NEED_FINANCIAL_FLAG + '\'' +
                ", NEED_DISPOSE_FLAG='" + NEED_DISPOSE_FLAG + '\'' +
                ", REMARK='" + REMARK + '\'' +
                ", POST_FLAG='" + POST_FLAG + '\'' +
                '}';
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

    public String getORI_ROLL_NO() {
        return ORI_ROLL_NO;
    }

    public void setORI_ROLL_NO(String ORI_ROLL_NO) {
        this.ORI_ROLL_NO = ORI_ROLL_NO;
    }

    public String getITEM_NO() {
        return ITEM_NO;
    }

    public void setITEM_NO(String ITEM_NO) {
        this.ITEM_NO = ITEM_NO;
    }

    public String getORI_PAPER_TYPE() {
        return ORI_PAPER_TYPE;
    }

    public void setORI_PAPER_TYPE(String ORI_PAPER_TYPE) {
        this.ORI_PAPER_TYPE = ORI_PAPER_TYPE;
    }

    public String getORI_PAPER_SIZE() {
        return ORI_PAPER_SIZE;
    }

    public void setORI_PAPER_SIZE(String ORI_PAPER_SIZE) {
        this.ORI_PAPER_SIZE = ORI_PAPER_SIZE;
    }

    public String getORI_UOM() {
        return ORI_UOM;
    }

    public void setORI_UOM(String ORI_UOM) {
        this.ORI_UOM = ORI_UOM;
    }

    public String getORI_WEIGHT() {
        return ORI_WEIGHT;
    }

    public void setORI_WEIGHT(String ORI_WEIGHT) {
        this.ORI_WEIGHT = ORI_WEIGHT;
    }

    public String getPRODUCTION_DATE() {
        return PRODUCTION_DATE;
    }

    public void setPRODUCTION_DATE(String PRODUCTION_DATE) {
        this.PRODUCTION_DATE = PRODUCTION_DATE;
    }

    public String getSTOCK_IN_DATE() {
        return STOCK_IN_DATE;
    }

    public void setSTOCK_IN_DATE(String STOCK_IN_DATE) {
        this.STOCK_IN_DATE = STOCK_IN_DATE;
    }

    public String getMACHINE_ID() {
        return MACHINE_ID;
    }

    public void setMACHINE_ID(String MACHINE_ID) {
        this.MACHINE_ID = MACHINE_ID;
    }

    public String getWAREHOUSE() {
        return WAREHOUSE;
    }

    public void setWAREHOUSE(String WAREHOUSE) {
        this.WAREHOUSE = WAREHOUSE;
    }

    public String getFLAT_SHEET() {
        return FLAT_SHEET;
    }

    public void setFLAT_SHEET(String FLAT_SHEET) {
        this.FLAT_SHEET = FLAT_SHEET;
    }

    public String getORI_SPECIFICATION() {
        return ORI_SPECIFICATION;
    }

    public void setORI_SPECIFICATION(String ORI_SPECIFICATION) {
        this.ORI_SPECIFICATION = ORI_SPECIFICATION;
    }

    public String getORI_REAM_QTY() {
        return ORI_REAM_QTY;
    }

    public void setORI_REAM_QTY(String ORI_REAM_QTY) {
        this.ORI_REAM_QTY = ORI_REAM_QTY;
    }

    public String getORI_QTY() {
        return ORI_QTY;
    }

    public void setORI_QTY(String ORI_QTY) {
        this.ORI_QTY = ORI_QTY;
    }

    public String getNEW_ROLL_NO() {
        return NEW_ROLL_NO;
    }

    public void setNEW_ROLL_NO(String NEW_ROLL_NO) {
        this.NEW_ROLL_NO = NEW_ROLL_NO;
    }

    public String getPAPER_TYPE() {
        return PAPER_TYPE;
    }

    public void setPAPER_TYPE(String PAPER_TYPE) {
        this.PAPER_TYPE = PAPER_TYPE;
    }

    public String getPAPER_SIZE() {
        return PAPER_SIZE;
    }

    public void setPAPER_SIZE(String PAPER_SIZE) {
        this.PAPER_SIZE = PAPER_SIZE;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public String getSPECIFICATION() {
        return SPECIFICATION;
    }

    public void setSPECIFICATION(String SPECIFICATION) {
        this.SPECIFICATION = SPECIFICATION;
    }

    public String getREAM_QTY() {
        return REAM_QTY;
    }

    public void setREAM_QTY(String REAM_QTY) {
        this.REAM_QTY = REAM_QTY;
    }

    public String getQTY() {
        return QTY;
    }

    public void setQTY(String QTY) {
        this.QTY = QTY;
    }

    public String getQC_PAPER_SIZE() {
        return QC_PAPER_SIZE;
    }

    public void setQC_PAPER_SIZE(String QC_PAPER_SIZE) {
        this.QC_PAPER_SIZE = QC_PAPER_SIZE;
    }

    public String getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(String WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getCONCLUSION() {
        return CONCLUSION;
    }

    public void setCONCLUSION(String CONCLUSION) {
        this.CONCLUSION = CONCLUSION;
    }

    public String getNEED_FINANCIAL_FLAG() {
        return NEED_FINANCIAL_FLAG;
    }

    public void setNEED_FINANCIAL_FLAG(String NEED_FINANCIAL_FLAG) {
        this.NEED_FINANCIAL_FLAG = NEED_FINANCIAL_FLAG;
    }

    public String getNEED_DISPOSE_FLAG() {
        return NEED_DISPOSE_FLAG;
    }

    public void setNEED_DISPOSE_FLAG(String NEED_DISPOSE_FLAG) {
        this.NEED_DISPOSE_FLAG = NEED_DISPOSE_FLAG;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public String getPOST_FLAG() {
        return POST_FLAG;
    }

    public void setPOST_FLAG(String POST_FLAG) {
        this.POST_FLAG = POST_FLAG;
    }
}
