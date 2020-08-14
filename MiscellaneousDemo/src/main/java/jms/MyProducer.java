package jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MyProducer {
	
	public static void main(String args[]) throws JMSException {
		
		//Create Connection Factory
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		
		//Create connection of Queue
		QueueConnection connection = factory.createQueueConnection();
		connection.start();
		
		//Create session
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//Create Destination Queue
		Destination destination = session.createQueue("Queue_1");
		
		//Create message producer
		MessageProducer messageProducer = session.createProducer(destination);
		
		//Create message
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText("Hi Manoj");
		
		//Sending message to Destination queue
		messageProducer.send(textMessage);
		
		System.out.println("Producer sent message to queue: message is : " + textMessage.getText());
		
		//Closing connection
		connection.close();
	}

}
