package SetterMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Setget.xml");

		ICoach theCoach = (ICoach)context.getBean("obj3", ICoach.class);
		ICoach theTeam = (ICoach)context.getBean("cc", ICoach.class);
		
	
		

		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theTeam.toString());
	}

}
