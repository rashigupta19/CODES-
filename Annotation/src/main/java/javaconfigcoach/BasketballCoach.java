package javaconfigcoach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class BasketballCoach implements Coach {

	private Fortune ifortune;
	public BasketballCoach() {
		System.out.println("BasketballCoach: inside default constructor");
	}

	public BasketballCoach(Fortune fortune) {
		this.ifortune = fortune;
	}

	public Fortune getIfortune() {
		return ifortune;
	}


	public void setIfortune1(Fortune ifortune) {
		System.out.println("BasketballCoach: inside setFortuneService() method");
		this.ifortune=ifortune;
	}

	public String getDailyWorkout() {
		return "Cheat day for you";
	}


	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}


}
