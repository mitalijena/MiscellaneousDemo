package springjms.topicdemo;

import java.net.URISyntaxException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJMSTopicTemplateDemo {

	public static void main(String[] args) throws URISyntaxException, Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context-topic.xml");
 
        try {
            //Topic
            SpringJMSPublisher springJmsPublisher = (SpringJMSPublisher) context
                    .getBean("springJMSPublisher");
            springJmsPublisher.sendMessage("SomeTask");
 
            SpringJMSSubscriber springJmsSubscriber = (SpringJMSSubscriber) context
                    .getBean("springJMSSubscriber");
            springJmsSubscriber.receiveMessage();
        } finally {
            context.close();
        }
    }
}
