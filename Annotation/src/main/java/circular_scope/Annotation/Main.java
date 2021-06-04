package circular_scope.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("annCircularScope.xml");
		System.out.println("bean factory called");
		A a_obj = (A) ac.getBean("a_bean");
		A a_obj2 = (A) ac.getBean("a_bean");
		((ClassPathXmlApplicationContext)ac).close();
        
	}
}
