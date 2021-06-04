package com.ncu.circularSpring.MavenSpring;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class bean_impl {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("CircularBean.xml");
		
		A a_obj = (A) ac.getBean("a_obj");
		A a_obj2 = (A) ac.getBean("a_obj");

	}

}