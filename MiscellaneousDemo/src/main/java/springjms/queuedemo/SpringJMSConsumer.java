package springjms.queuedemo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SpringJMSConsumer {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	Destination destination;
	
	public String receiveMessage() throws JMSException {
        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);       
        return textMessage.getText();
    }

}
