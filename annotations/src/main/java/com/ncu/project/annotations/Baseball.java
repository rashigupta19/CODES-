package com.ncu.project.annotations;

public class Baseball implements ICoach{
private IFortune ifortune;

	
	public Baseball(IFortune ifortune) {
		this.ifortune = ifortune;
    }

	@Override
	public String getDailyWorkout() {
		return "daily workout- 3 hrs";
	}

	@Override
	public String getDailyFortune() {
		return ifortune.getFortune();
	}

}