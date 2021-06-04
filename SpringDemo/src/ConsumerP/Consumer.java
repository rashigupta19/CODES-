package ConsumerP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("consumer.xml");

		IProducer theFPro = (IProducer)context.getBean("fpro", IProducer.class);
		
		IProducer Pro = (IProducer)context.getBean("pro", IProducer.class);
		
		// call methods on the bean
	    theFPro.first();
	
		Pro.first();
	}

}
