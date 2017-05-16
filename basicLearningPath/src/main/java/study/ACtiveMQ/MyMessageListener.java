package study.ACtiveMQ;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by lizhupeng on 2017/5/16.
 */
public class MyMessageListener implements MessageListener{
    @Override
    public void onMessage(Message message) {
        TextMessage tm = (TextMessage) message;
        try {
            System.out.println("Received message: " + tm.getText() + ":" + tm.getStringProperty("property"));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
