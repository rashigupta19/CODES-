package configJavaAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



public class Employee {
	
	private Department dept;
	private Address add;
    @Value(value="Sumit")
    private String Emp_name;
	
	public String getEmp_name() {
		return Emp_name;
	}


	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}


	@Override
	public String toString() {
		return "Employee [Employee_name=" + Emp_name + ", Dept=" + dept + ", add = " + add + "]";
	}
	public Employee(Department dept, Address add) {
		this.dept = dept;
		this.add = add;
	}
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Department getDept() {
		return dept;
	}

	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Address getAdd() {
		return add;
	}

	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}
	
}