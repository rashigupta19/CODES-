package pointcutCombination;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {
	
	String Account;

	
	public String getAccount() {
		return Account;
	}


	public void setAccount(String account) {
		Account = account;
	}


	public void addAccount() {
		System.out.println("in account add");
	}
	
}