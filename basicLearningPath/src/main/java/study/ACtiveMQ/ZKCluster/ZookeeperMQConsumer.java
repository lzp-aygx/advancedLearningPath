package study.ACtiveMQ.ZKCluster;

import org.apache.activemq.ActiveMQConnectionFactory;
import study.ACtiveMQ.MyMessageListener;

import javax.jms.*;

/**
 * Created by lizhupeng on 2017/6/12.
 */
public class ZookeeperMQConsumer {

    public static void main(String[] args) throws JMSException {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("failover:(tcp://192.168.28.101:61616,tcp://192.168.28.102:61616,tcp://192.168.28.103:61616)?Randomize=false");
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        connection.start();
        Destination dest = session.createQueue("first");
        MessageConsumer consumer = session.createConsumer(dest);
        System.out.println("Waiting for messages...");
//        TextMessage tm = (TextMessage)consumer.receive();
        consumer.setMessageListener(new MyMessageListener());
//        System.out.println(tm.getText());
    }

}
