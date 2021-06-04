package los2;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("defaulter")
public class Defaulter {

	public ArrayList<Customer> getNegativeCustomer() {
		
		ArrayList<Customer> negativeCustomers=new ArrayList<>();
		Customer customer=new Customer();
		customer.setId(1010);
		PersonalInformation pd=new PersonalInformation();
		pd.setFirstName("tim");
		pd.setLastName("jackson");
		pd.setPhone("9876543210");
		pd.setPanCard("BW1000");
		pd.setVoterId("123456789876");
		pd.setEmail("tim@gmail.com");
		pd.setAge(24);
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		customer=new Customer();
		customer.setId(1010);
		pd=new PersonalInformation();
		pd.setFirstName("tom");
		pd.setLastName("dahl");
		pd.setPhone("3333");
		pd.setPanCard("BW2000");
		pd.setVoterId("A222");
		pd.setEmail("tom@gmail.com");
		pd.setAge(30);
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		return negativeCustomers;
		
	}
}