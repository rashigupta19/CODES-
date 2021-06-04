package firstmvc.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import firstmvc.customValidation.CourseCode;
import firstmvc.customValidation.IsValidPassword;

public class CustomerInfo {
	
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String name;
	
    private long id;


	@NotNull(message="is required")
	@Pattern(regexp= "[0-9]{10}", message="Only 10 digits allowed")
    private String contactNumber;
    
    @NotNull(message="is required")
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="email required")
    private String email;
    
    private String country;
    
	@NotNull(message="is required")
	@Size(min=2, message="is required")
    private String Lname;
	
	@IsValidPassword
	private String password;
	
	
	@CourseCode(value={"CSE","ECE"}, message="must start with CSE,ECE")
	private String courseCode;
    
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
    

    

}
