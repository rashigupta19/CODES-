package autowiringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dept")
public class Department {
	
	@Value(value="ECE")
	private String dept_name;
	@Value(value="202")
	private int dept_num;
	
	@Override
	public String toString() {
		return "Dept_name = " + dept_name + ", Dept_num = " + dept_num;
	}
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getDept_num() {
		return dept_num;
	}
	public void setDept_num(int dept_num) {
		this.dept_num = dept_num;
	}
		
}
