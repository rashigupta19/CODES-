package secondmvc.models;

public class Employee {
	
	private String empname;
	private String empid;


	public Employee(String empname, String empid ) {
		this.empid=empid;
		this.empname=empname;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	

}
