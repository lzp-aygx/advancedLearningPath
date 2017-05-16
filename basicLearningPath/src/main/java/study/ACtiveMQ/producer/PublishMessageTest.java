package study.ACtiveMQ.producer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by lizhupeng on 2016/7/12.
 */
public class PublishMessageTest {
    public static void main(String[] args) throws JMSException{
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("aygx.topic.Persistent.test");
        MessageProducer producer = session.createProducer(topic);
        //使用持久模式发送消息;当使用这种模式发送的消息都会存储在消息服务器的持久化存储地方
        producer.setDeliveryMode(DeliveryMode.PERSISTENT);
        TextMessage message = session.createTextMessage();
        message.setText("topic 消息。");
        message.setStringProperty("property", "消息Property");
        //发送主题消息
        producer.send(message);
        System.out.println("Sent message: " + message.getText());
        session.commit();
        session.close();
        connection.close();
    }
}
