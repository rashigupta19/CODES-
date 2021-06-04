package configJavaAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	 public static void main( String[] args )
	    {
	        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
	        Employee emp= context.getBean("emp",Employee.class);
	        System.out.println(emp.toString());
	    }
}