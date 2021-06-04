package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Scope.xml");
		ICoach coach=(ICoach)context.getBean("tcoach");
		ICoach coach1=(ICoach)context.getBean("tcoach");
		ICoach coach2=(ICoach)context.getBean("tcoach");
		
		coach.setName("John");
		coach1.setName("Liam");
		coach2.setName("Jacob");
		
		System.out.println(coach.getName());
		System.out.println(coach1.getName());	
		System.out.println(coach2.getName());	
		
	}

}
