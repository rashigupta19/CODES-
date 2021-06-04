package com.annBeanLifeCycle.IOCannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("LifeCycle.xml");
		
		ICoach coach=(ICoach)context.getBean("tcoach");
		
		coach.setName("Rashi");
		System.out.println(coach.getName());
		
		((ClassPathXmlApplicationContext)context).close();

		
	}

}
