package springjms.topicdemo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJMSPublisher {
	
	@Autowired
	private JmsTemplate jmsTemplateTopic;
	
	@Autowired
	private Destination destination;
	
	public void sendMessage(final String msg) throws JMSException {
        TopicConnectionFactory factory = (TopicConnectionFactory) jmsTemplateTopic.getConnectionFactory();
        TopicConnection connection = factory.createTopicConnection();
        TopicSession session =  connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
        TopicPublisher publisher = session.createPublisher((Topic) destination);
        connection.start();
        TextMessage msg1 = session.createTextMessage("Hello");
        publisher.publish(msg1);
        System.out.println("SpringJMSPublisher : Message Published : "+msg1.getText());
        /*jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }});*/      
    }
}
