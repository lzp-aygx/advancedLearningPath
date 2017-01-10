package study.ACtiveMQ.producer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by lizhupeng on 2016/7/12.
 */
public class PublishMessageTest {

    Connection connection = null;
    Session session;
    Destination destination;
    MessageProducer messageProducer;

    ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin","admin","http://localhost:8161/");
}
