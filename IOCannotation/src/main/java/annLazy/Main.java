package annLazy;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Lazy.xml");
		
		A a_obj = (A) ac.getBean("a_bean");
		A a_obj2 = (A) ac.getBean("a_bean");
	

	}
}

