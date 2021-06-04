package com.ncu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring.xml");

		ICoach theCoach = (ICoach)context.getBean("obj1", ICoach.class);
		
		ICoach Cricket = (ICoach)context.getBean("obj2", ICoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	//	System.out.println(Cricket.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
	}

}
