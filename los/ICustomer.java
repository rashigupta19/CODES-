package los;

import java.util.ArrayList;

public interface ICustomer {
	
	public void setStage(int stage);
	public void setId(int id);
	public void setIncome(double income);
	public void setLiability(double liability);
	
	public LoanDetails getLoanDetails();
	public int getId();
	public int getStage();
	public Address getAddress();
	public PersonalInformation getPersonal();
	public double getIncome();
	public double getLiability();

}
