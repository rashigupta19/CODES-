package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Baseball implements ICoach{
private IFortune ifortune;


	public ArrayList<String> list=new ArrayList<String>();
	public HashSet<Integer> set=new HashSet<>();
	public IFortune getIfortune() {
	return ifortune;
}

	
	
	public ArrayList<String> getList() {
		return list;
	}



	public void setList(ArrayList<String> list) {
		this.list = list;
	}



	public HashSet<Integer> getSet() {
		return set;
	}



	public void setSet(HashSet<Integer> set) {
		this.set = set;
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



	@Override
	public String toString() {
		return "Baseball [ list=" + list + ", set=" + set + "]";
	}

	
}