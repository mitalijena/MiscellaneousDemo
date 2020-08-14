package springjdbctemplate;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class EmployeeDemo {
	
	//Using BeanFactory container
	/*Resource resource = (Resource) new ClassPathResource("application-context.xml");
	@SuppressWarnings("deprecation")
	BeanFactory beanFactory = new XmlBeanFactory(resource);*/
	
	//Using ApplicationContext container
	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
	
	//context.getBean()
	
}
