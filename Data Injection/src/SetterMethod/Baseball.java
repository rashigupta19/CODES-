package SetterMethod;

public class Baseball implements ICoach{
private IFortune ifortune;

	


	public IFortune getIfortune() {
	return ifortune;
}

public void setIfortune(IFortune ifortune) {
	System.out.println("using setters");
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