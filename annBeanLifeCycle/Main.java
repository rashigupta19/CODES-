package annBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("annBeanLifeCycle.xml");
		
		ICoach coach=(ICoach)context.getBean("tcoach");
		ICoach coach1=(ICoach)context.getBean("tcoach");
		coach.setName("Virendra");
		System.out.println(coach.getName());
		System.out.println(coach1.getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
