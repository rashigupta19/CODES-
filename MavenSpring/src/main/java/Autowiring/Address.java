package Autowiring;


public class Address {
	
	
	private String hno;
	private String city;
	private String state;
	private String pincode;
	
	
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	
	public String getHno() {
		return hno;
	}


	public void setHno(String hno) {
		this.hno = hno;
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
