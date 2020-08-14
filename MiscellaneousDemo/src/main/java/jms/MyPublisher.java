package jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MyPublisher {
	
	public static void main(String args[]) throws JMSException {
		
		//Create Connection Factory
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		
		//Create connection of Queue
		TopicConnection connection = factory.createTopicConnection();
		
		//Create session
		TopicSession session = (TopicSession) connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//Create Destination Queue
		Destination destination = session.createTopic("Topic_1");
		
		//Create message producer
		TopicPublisher publisher = session.createPublisher((Topic) destination);
		
		//Create message
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText("Topic : Hi Manoj");
		
		//Sending message to Destination queue
		publisher.publish(textMessage);
		
		System.out.println("Publisher : Message published: " + textMessage.getText());
		
		//Closing connection
		connection.close();
	}

}
