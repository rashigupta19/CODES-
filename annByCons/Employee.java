package annByCons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	
	private Department dept;
	private Address add;
	
	@Override
	public String toString() {
		return "Employee [" + dept + ", add = " + add + "]";
	}
	
	@Autowired
	public Employee(Department dept, Address add) {
		this.dept = dept;
		this.add = add;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
}