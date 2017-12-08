package advancedPath.entity;

/**
 * Created by lizhupeng on 2017/1/6.
 */
public class CommonResponse {
    private String ResultCode;
    private String ResultMessage;

    public CommonResponse() {
    }

    public String getResultMessage() {
        return ResultMessage;
    }

    public void setResultMessage(String resultMessage) {
        ResultMessage = resultMessage;
    }

    public String getResultCode() {
        return ResultCode;
    }

    public void setResultCode(String resultCode) {
        ResultCode = resultCode;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "ResultCode='" + ResultCode + '\'' +
                ", ResultMessage='" + ResultMessage + '\'' +
                '}';
    }
}
