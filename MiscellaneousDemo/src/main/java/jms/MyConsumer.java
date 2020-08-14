package jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.QueueConnection;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MyConsumer {
	

	
	public static void main(String args[]) throws JMSException {
		
		//Create Connection Factory
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
		
		//Create connection of Queue
		QueueConnection connection = factory.createQueueConnection();
		
		//Create session
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		//Create Destination Queue
		Destination destination = session.createQueue("Queue_1");
		
		//Create message producer
		MessageConsumer messageConsumer = session.createConsumer(destination);
		
		connection.start();
		
		//Sending message to Destination queue
		Message msg = messageConsumer.receive();
		if(msg instanceof TextMessage) {
			System.out.println("Consumer Received message from queue : message is : " + ((TextMessage)msg).getText());
		}
		
		//Closing connection
		connection.close();
	}



}
