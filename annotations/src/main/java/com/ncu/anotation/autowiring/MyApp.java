package com.ncu.anotation.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
		CricketCoach cricket=(CricketCoach)ac.getBean("ccoach",CricketCoach.class);

		System.out.println(cricket.getDailyWorkout());
		System.out.println(cricket.getDailyFortune());
		
	}
}
