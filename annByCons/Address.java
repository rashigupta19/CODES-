package annByCons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	@Value(value="${hno}")
	private String H_No;
	@Value(value="${city}")
	private String city ;
	@Value(value="Andhra Pradesh")
	private String state ;
	@Value(value="Bhutan")
	private String country ;

	public void initMethod() {
		System.out.println("this is init method");
	}
	
	public void destroyMethod() {
		System.out.println("this is pre destroy method");
	}
	
	@Override
	public String toString() {
		return "[H_No = " + H_No + ", city = " + city + ", state = " + state + ", country = " + country + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getH_No() {
		return H_No;
	}
	public void setH_No(String h_No) {
		H_No = h_No;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
