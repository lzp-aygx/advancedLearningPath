package study.ACtiveMQ.producer;

import org.apache.activemq.ActiveMQConnectionFactory;
import study.ACtiveMQ.MyMessageListener;

import javax.jms.*;

/**
 * Created by lizhupeng on 2017/5/15.
 */
public class DurableComsumerTest {

    public static void main(String[] args) throws JMSException {
        //一个持久化订阅Subscriber由clientId和subscriptionName共同组成唯一主键
        String clientId = "aygx.topic.Persistent.test.clientId";
        String subscriptionName = "aygx.topic.Persistent.test.subscriptionName";
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection = factory.createConnection();
        //客户端ID,持久订阅需要设置
        connection.setClientID(clientId);
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        // 创建主题
        Topic topic = session.createTopic("aygx.topic.Persistent.test");
        // 创建持久订阅,指定客户端ID。
        MessageConsumer consumer = session.createDurableSubscriber(topic, subscriptionName);
        consumer.setMessageListener(new MyMessageListener());

    }
}
