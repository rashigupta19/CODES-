package blc;

public class Baseball implements ICoach{
private IFortune ifortune;

public Baseball() {
	System.out.println("in Baseball constructor");
}

	public IFortune getIfortune() {
	return ifortune;
}

public void setIfortune(IFortune ifortune) {
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
	
	public void doMyStartupStuff() {
		System.out.println("init method is called");
	}
	
	public void doMyDestroyStuff() {
		System.out.println("destroy method is called");
	}

}