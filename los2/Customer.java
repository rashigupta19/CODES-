package los2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	private int id;
	private int stage;
	private Address address;
	private double income;
	private double liability;
	private PersonalInformation personal; 
	private LoanDetails loanDetails; 

	public int getStage() {
		return stage;
	}
	
	public void setStage(int stage) {
		this.stage = stage;
	}
	
	public LoanDetails getLoanDetails() {
		return loanDetails;
	}
	
	@Autowired
	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getLiability() {
		return liability;
	}
	public void setLiability(double liability) {
		this.liability = liability;
	}
	
	public PersonalInformation getPersonal() {
		return personal;
	}
	@Autowired
	public void setPersonal(PersonalInformation personal) {
		this.personal = personal;
	}
	
}
