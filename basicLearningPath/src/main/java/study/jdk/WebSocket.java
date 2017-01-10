package study.jdk;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by lizhupeng on 2016/10/11.
 */
/**注解ServerEndpoint将当前类定义成WebSocket,
 *属性  value:设置访问地址
 *      configurator:
 *      decoders:
 *      encoders:
 *      subprotocols:
 * */
@ServerEndpoint(value = "/WebSocket")
public class WebSocket{

    /**
     * 定义静态变量用来记录连接数
     * */
    private static int onlineCount = 0 ;

    /**
     * 使用concurrent 包的线程安全Set,,用来存储每个客户端对应的MyWebSocket对象
     * 若要实现服务端与单一客户端通信的话,可以是用map来存放,其中Key可以设置为用户标识
     * */
    private static CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<WebSocket>();

    /**与客户端连接的会话*/
    private Session session;

    /**
     * 建立连接成功的调用方法@OnOpen
     * @param session 可选参数.
     * */
    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        webSocketSet.add(this);    //将当前WebSocket加入到set中
        addOnlineCount();           //连接数加一
        System.out.println("有新连接加入,当前在线人数为" + getOnlineCount());
        System.out.println("new");
        System.out.println(session);
        System.out.println(session.getBasicRemote());
        System.out.println(session.getRequestURI());
        System.out.println(session.getId());
    }

    /**
     *连接关闭的调用方法
     * */
    @OnClose
    public  void onClose(){
        webSocketSet.remove(this); //将关闭的WebSocket从Set上删除
        subOnlineCount();           //连接数减一
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     * @param session 可选参数
     * */
    @OnMessage
    public void onMessage(String message ,Session session){
        System.out.println("客户端消息:" + message);
        for(WebSocket item : webSocketSet){
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 发生错误是调用的方法
     * @param session
     * @param error
     * */
    @OnError
    public void onError(Session session , Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
                return onlineCount;
            }
    public static synchronized void addOnlineCount() {
                 WebSocket.onlineCount++;
            }
    public static synchronized void subOnlineCount() {
                 WebSocket.onlineCount--;
            }


}
