package com.ncu.setter;

import com.ncu.setter.IFortune;

public class CricketCoach implements Coach{
	private IFortune ifortune;
	private String name;
	private String email;
	private String team_name;
	private Address add;  //injection has- a- relationship
	
	@Override
	public String toString() {
		return "CricketCoach [ifortune=" + ifortune + ", name=" + name + ", email=" + email + ", team_name=" + team_name
				+ ", add=" + add + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

}
