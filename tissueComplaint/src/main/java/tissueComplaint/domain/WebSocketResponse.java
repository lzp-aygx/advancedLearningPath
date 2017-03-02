package tissueComplaint.domain;

/**
 * Created by lizhupeng on 2017/2/24.
 */
public class WebSocketResponse {
    private String responseMessage;

    public WebSocketResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}
