package annByCons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 public static void main( String[] args )
	    {
	        ApplicationContext context=new ClassPathXmlApplicationContext("annByCons.xml");
	        Employee emp=(Employee)context.getBean("emp");
	        System.out.println(emp.toString());
	    }
}