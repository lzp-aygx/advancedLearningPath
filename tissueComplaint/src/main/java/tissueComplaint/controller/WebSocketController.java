package tissueComplaint.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import tissueComplaint.domain.WebSocketMessage;
import tissueComplaint.domain.WebSocketResponse;

/**
 * Created by lizhupeng on 2017/2/24.
 */

@Controller
public class WebSocketController {
    @MessageMapping("/welcome")//客户端想服务器端发送请求时,通过@MessageMapping映射/welcome地址
    @SendTo("/topic/getResponse")//当服务器端有消息接收到的时候,会对订阅了@SendTo中的路径的客户端发送消息
    public WebSocketResponse hello (WebSocketMessage message) throws Exception{
        return  new WebSocketResponse("Welcome " +message.getName());
    }

}
