package springjms.queuedemo;

import java.net.URISyntaxException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJMSQueueTemplateDemo {

	public static void main(String[] args) throws URISyntaxException, Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context-queue.xml");
 
        try {
        	//Queue
            SpringJMSProducer springJmsProducer = (SpringJMSProducer) context
                    .getBean("springJMSProducer");
            springJmsProducer.sendMessage("SomeTask");
 
            SpringJMSConsumer springJmsConsumer = (SpringJMSConsumer) context
                    .getBean("springJMSConsumer");
            //System.out.println("Consumer receives " + springJmsConsumer.receiveMessage());
            
        } finally {
            context.close();
        }
    }
}
