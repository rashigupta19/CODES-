package com.annBeanLifeCycle.IOCannotation;

import org.springframework.stereotype.Component;

@Component("fortune")
public class Fortune implements IFortune{
	
//	public Fortune() {
//		System.out.println("in fortune constructor");
//	}
	
	public String getFortune() {
		return "you have a good fortune today";
	}

}
