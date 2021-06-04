package com.annBeanLifeCycle.IOCannotation;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tcoach")
@Scope("singleton")
public class TennisCoach implements ICoach{

	private IFortune ifortune;
	@Value(value="rrr")
	private String name;

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("init method call");
	}

	@PreDestroy
	public void doMyCleanupStuff()  {
		System.out.println("Destroy method call");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 30 hrs daily";
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.ifortune = ifortune;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
}
