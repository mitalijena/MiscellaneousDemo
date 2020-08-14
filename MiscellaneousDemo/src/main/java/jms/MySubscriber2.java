package jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MySubscriber2 {
	
	public static void main(String args[]) throws JMSException {
		
		//Create Connection Factory
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		
		//Create connection of Queue
		QueueConnection connection = factory.createQueueConnection();
		
		//Create session
		TopicSession session = (TopicSession) connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//Create Destination Queue
		Topic destination = session.createTopic("Topic_1");
		
		//Create message producer
		TopicSubscriber topicSubscriber = session.createSubscriber(destination);
		
		connection.start();
		
		//Sending message to Destination queue
		Message msg = topicSubscriber.receive();
		if(msg instanceof TextMessage) {
			System.out.println("Received message is : " + ((TextMessage)msg).getText());
		}
		
		//Closing connection
		connection.close();
	}

}
