package predestroyPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("prototypebean.xml");
	
		C a_obj = (C) ac.getBean("c_bean");

		((ClassPathXmlApplicationContext)ac).close();
        
	}
}
