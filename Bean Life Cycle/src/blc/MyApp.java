package blc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle.xml");
		
		System.out.println("Inside bean factory");

	
		ICoach theTeam = (ICoach)context.getBean("cc", ICoach.class);
		System.out.println(theTeam);

		
		System.out.println(theTeam.getDailyFortune());
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
