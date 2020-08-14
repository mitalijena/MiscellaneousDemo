package jms;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MySubscriber1 {

	public static void main(String args[]) throws JMSException {

		// Create Connection Factory
		//TopicConnectionFactory factory = new ActiveMQConnectionFactory();
		TopicConnectionFactory factory = new ActiveMQConnectionFactory();

		// Create connection of Queue
		TopicConnection connection = (TopicConnection) factory.createConnection();

		// Create session
		TopicSession session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

		// Create Destination Topic
		Topic topic = session.createTopic("Topic_1");

		// Create message producer
		TopicSubscriber topicSubscriber = session.createSubscriber(topic);
		//MessageConsumer consumer = session.createConsumer(topic);

		/*MyListener myListener = new MyListener();
		consumer.setMessageListener(myListener);*/
		
		connection.start();
		
		System.out.println("start");

		// receive the message
		TextMessage message = (TextMessage) topicSubscriber.receive();

		// print the message
		System.out.println("Message received: " + message.getText());

		// Sending message to Destination queue
		/*
		 * Message msg = topicSubscriber.receive(); if(msg instanceof TextMessage) {
		 * System.out.println("Subscriber : Received message is : " + ((TextMessage)msg).getText());
		 * }
		 */

		// Closing connection
		connection.close();
	}

}
