package LabExercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	String name;
	int age;
	private Address add;
	int no_of_days_working;
  
	 
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

  
	public void setAge(int age) {
		this.age = age;
	}

    
	public Address getAdd() {
		return add;
	}

	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}


	public int getNo_of_days_working() {
		return no_of_days_working;
	}

	@Value(value="30")
	public void setNo_of_days_working(int no_of_days_working) {
		this.no_of_days_working = no_of_days_working;
	}


	public int calculate_sal() {
		 System.out.println("Caculate method");
		 
		 int salary = getNo_of_days_working()+2000;
		 
		return salary; 
		
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", add=" + add + ", no_of_days_working=" + no_of_days_working
				+ "]";
	}

	

}
