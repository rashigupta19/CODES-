package com.ncu.project.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("ccoach")
public class CricketCoach implements ICoach {

	private IFortune ifortune;
	public CricketCoach() {
		
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	@Autowired
	public void setIfortune(IFortune ifortune) {
		System.out.println("set fortune method");
		this.ifortune=ifortune;
	}

	public String getDailyWorkout() {
		return "Daily workout";
	}


	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

}