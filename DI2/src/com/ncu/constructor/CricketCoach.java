package com.ncu.constructor;

public class CricketCoach implements ICoach {

	//define a private field for dependency
	private IFortune ifortune;
	private String name;
	private String email;
	private String team_name;
	
	public CricketCoach() {
		
	}
	
	public CricketCoach(String name,String email,String team_name) {
		this.name=name;
		this.email=email;
		this.team_name=team_name;
	}
	
	
	public String toString() {
		return " name="+name+",email="+email+",team_name="+team_name+"";
		
		
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
		System.out.println("inside setter method");
		this.ifortune = ifortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice batting 15hrs daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}

}