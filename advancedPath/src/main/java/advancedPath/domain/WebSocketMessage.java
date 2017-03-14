package advancedPath.domain;

/**
 * Created by lizhupeng on 2017/2/24.
 */
public class WebSocketMessage {
    private String name;
    private String message;

    public String getName(){
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }
}
