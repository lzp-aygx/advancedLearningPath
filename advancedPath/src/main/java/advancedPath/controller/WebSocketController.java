package advancedPath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import advancedPath.domain.WebSocketMessage;
import advancedPath.domain.WebSocketResponse;

import java.security.Principal;

/**
 * Created by lizhupeng on 2017/2/24.
 */

@Controller
public class WebSocketController {
    @MessageMapping("/welcome")//客户端想服务器端发送请求时,通过@MessageMapping映射/welcome地址
    @SendTo("/topic/getResponse")//当服务器端有消息接收到的时候,会对订阅了@SendTo中的路径的客户端发送消息
    public WebSocketResponse hello(WebSocketMessage message) throws Exception {
        return new WebSocketResponse("Welcome " + message.getName());
    }


    @Autowired
    private SimpMessagingTemplate messagingTemplate;//1

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) { //2
        if (principal.getName().equals("lzp")) {//3
            messagingTemplate.convertAndSendToUser("lizhupeng",
                    "/queue/notifications", principal.getName() + "-send:" + msg);
        } else {
            messagingTemplate.convertAndSendToUser("lzp",
                    "/queue/notifications", principal.getName() + "-send:" + msg);
        }
    }

}
