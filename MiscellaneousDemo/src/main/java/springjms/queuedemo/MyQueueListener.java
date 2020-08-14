package springjms.queuedemo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyQueueListener implements MessageListener {

	//@Override
	public void onMessage(Message message) {
		System.out.println("OnMessage method");
		if(message instanceof TextMessage) {
			try {
				System.out.println("MyQueueListener : Received message is from Topic : " + ((TextMessage)message).getText());
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
