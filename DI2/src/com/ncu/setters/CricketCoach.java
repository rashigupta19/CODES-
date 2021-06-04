package com.ncu.setters;

public class CricketCoach implements ICoach {

	//define a private field for dependency
	private IFortune ifortune;
	private String name;
	private String email;
	private String team_name;
	private Address add;
	
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
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

	
	
	@Override
	public String toString() {
		return "CricketCoach [ name=" + name + ", email=" + email + ", team_name=" + team_name
				+ ", add=" + add + "]";
	}



	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
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