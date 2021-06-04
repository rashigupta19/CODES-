package com.ncu.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Set.xml");

	
		ICoach theTeam = (ICoach)context.getBean("cc", ICoach.class);
		
		
		System.out.println(theTeam.toString());
	}

}
