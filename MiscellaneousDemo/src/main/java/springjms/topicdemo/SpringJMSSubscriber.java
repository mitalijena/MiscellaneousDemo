package springjms.topicdemo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJMSSubscriber {
	

	
	@Autowired
	private JmsTemplate jmsTemplateTopic;
	
	@Autowired
	private Destination destination;
	
	public void receiveMessage() throws JMSException {
        TopicConnectionFactory factory = (TopicConnectionFactory) jmsTemplateTopic.getConnectionFactory();
        TopicConnection connection = factory.createTopicConnection();
        TopicSession session =  connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
        TopicSubscriber subscriber = session.createSubscriber((Topic) destination);
        connection.start();
        subscriber.setMessageListener(new MyTopicListener());
        /*jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }});*/      
    }


}
