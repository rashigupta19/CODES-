package scope;

public class TennisCoach implements ICoach{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override	
	public String getDailyWorkout() {
		return "subeh sham khelo";
	}
}
