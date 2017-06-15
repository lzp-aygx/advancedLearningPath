package study.ACtiveMQ.ZKCluster;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by lizhupeng on 2017/6/12.
 */
public class ZookeeperMQSender {

    public static void main(String[] args) throws JMSException, InterruptedException {
        System.out.println("Zk Connecting");
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("failover:(tcp://192.168.28.101:61616,tcp://192.168.28.102:61616,tcp://192.168.28.103:61616)?Randomize=false");
        Connection connection = connectionFactory.createConnection();
        connection.start();
        System.out.println("Zk Connected");
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("first");
        MessageProducer producer = session.createProducer(null);
        for (int i = 0; i < 5000000; i++) {
            TextMessage msg = session.createTextMessage("我是消息内容" + i);
            // 第一个参数目标地址
            // 第二个参数 具体的数据信息
            // 第三个参数 传送数据的模式
            // 第四个参数 优先级
            // 第五个参数 消息的过期时间
            producer.send(destination, msg);
            System.out.println("发送消息：" + msg.getText());
            Thread.sleep(1000);
        }

    }
}
