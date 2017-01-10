package tissueComplaint.entity;

import org.springframework.boot.jackson.JsonComponent;

/**
 * Created by lizhupeng on 2016/12/24.
 */
@JsonComponent
public class Paper {
    private int fid;
    private String PaperID;
    private String PaperName;
    private String pritype;

    public Paper() {
    }

    public Paper(int fid, String paperID, String paperName, String pritype) {
        this.fid = fid;
        PaperID = paperID;
        PaperName = paperName;
        this.pritype = pritype;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getPaperID() {
        return PaperID;
    }

    public void setPaperID(String paperID) {
        PaperID = paperID;
    }

    public String getPaperName() {
        return PaperName;
    }

    public void setPaperName(String paperName) {
        PaperName = paperName;
    }

    public String getPritype() {
        return pritype;
    }

    public void setPritype(String pritype) {
        this.pritype = pritype;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "fid=" + fid +
                ", PaperID='" + PaperID + '\'' +
                ", PaperName='" + PaperName + '\'' +
                ", pritype='" + pritype + '\'' +
                '}';
    }
}
