package tissueComplaint.webConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by lizhupeng on 2017/2/22.
 */

/**
 * WebSocket是通过socket来实现双向异步通信的,但是直接使用WebSocket或者SockJS协议的模型,显得特别繁琐.
 * 一般我们会使用它的子协议STOMP,它是一个更高级的协议,
 * STOMP协议使用一个基于帧的格式来定义消息.
 * */
@Configuration
//通过注解来开启使用STOMP协议来传输基于代理的消息,
//这样子控制器支持使用@MessageMapping,跟@RequestMapping一样
@EnableWebSocketMessageBroker
public class WebSocket extends AbstractWebSocketMessageBrokerConfigurer{

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        //注册一个STOMP协议的节点(endpoint),并映射的指定的URL
        stompEndpointRegistry.addEndpoint("/endpoint").withSockJS();
    }

    @Override
    public void  configureMessageBroker(MessageBrokerRegistry registry){
        //广播式应用配置/topic消息代理
        registry.enableSimpleBroker("/topic");
    }


}
