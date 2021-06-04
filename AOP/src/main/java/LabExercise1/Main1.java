package LabExercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		Employee xx=context.getBean("emp", Employee.class);
		xx.setName("Rashi");
		System.out.println("After Set name");
		System.out.println(xx.getName());
		System.out.println(xx.calculate_sal());
		
		

	}

}
