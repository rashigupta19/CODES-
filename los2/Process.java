package los2;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("process")
public class Process implements StageConstants{
	
	private ArrayList<Customer> customer_list = new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	static int serialCounter=1;
	
	private Customer customer;
	private Address add;
	private PersonalInformation pd;
	private LoanDetails loanDetails;
	private Defaulter defaulter;
	private Validator valid;

	public Address getAdd() {
		return add;
	}

	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}

	public Validator getValid() {
		return valid;
	}

	@Autowired
	public void setValid(Validator valid) {
		this.valid = valid;
	}

	public Defaulter getDefaulter() {
		return defaulter;
	}

	@Autowired
	public void setDefaulter(Defaulter defaulter) {
		this.defaulter = defaulter;
	}

	public Customer getCustomer() {
		return customer;
	}

	@Autowired
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PersonalInformation getPd() {
		return pd;
	}
	
	@Autowired
	public void setPd(PersonalInformation pd) {
		this.pd = pd;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	@Autowired
	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public void sourcing() {
		customer.setId(serialCounter);
		customer.setStage(SOURCING);
		System.out.println("\n\nEnter the FirstName:");
		String firstName=scan.next();
		System.out.println("Enter the LastName:");
		String lastName= scan.next();
		System.out.println("Enter the Age:");
		int tempAge=scan.nextInt();
		int age=0;
		
		while(!(valid.isValidAge(tempAge))) {
			System.out.println("Invalid Age!!");
			System.out.println("Enter the Age: ");
			tempAge=scan.nextInt();
		}
		
		age=tempAge;
		
//		System.out.println("\n\nEnter the pincode:");
//		int pincode=scan.nextInt();
//		System.out.println("\n\nEnter the Landmark:");
//		String landmark=scan.next();
//		System.out.println("\n\nEnter the City:");
//		String city=scan.next();
//		System.out.println("\n\nEnter the State:");
//		String state=scan.next();
//		System.out.println("\n\nEnter the country:");
//		String country=scan.next();
		
		System.out.println("Enter the loan type HL,AL,PL:");
		String tempType=scan.next();
		String type=null;
		
		while(!(valid.isValidType(tempType))) {
			System.out.println("Invalid Type!!! \nEnter one of the values: AL,HL,PL");
			System.out.println("Enter the Type: ");
			tempType=scan.next();
		}
		
		type=tempType;
		
		System.out.println("Enter the amount:");
		double amount=scan.nextDouble();
		System.out.println("Duration of loan (in months) :");
		int duration=scan.nextInt();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		loanDetails.setType(type);
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		customer.setLoanDetails(loanDetails);	
//		add.setCity(city);
//		add.setLandmark(landmark);
//		add.setPinCode(pincode);
//		add.setState(state);
//		add.setCountry(country);
//		customer.setAddress(add);
		customer_list.add(customer);
		serialCounter++;
		System.out.println("\n\t\t\tSOURCING Done....");
		System.out.println("\nYour Application No. is "+ customer.getId());
	}
	
	
	public void qde(Customer customer) {
		
		customer.setStage(QDE);
		System.out.println("\n\n***********************");
		System.out.println("Application Number: " +customer.getId());
		System.out.println("Name: " + customer.getPersonal().getFirstName()+ " " + customer.getPersonal().getLastName());
		System.out.println("You applied for a " + customer.getLoanDetails().getType() +
				" for DURATION: " + customer.getLoanDetails().getDuration() + 
				" of AMOUNT: " +customer.getLoanDetails().getAmount());
		System.out.println("***********************");
		System.out.println("Enter the PanCard Number: ");
		String panCard=scan.next();
		System.out.println("Enter the Aadhar number: ");
		String temp=scan.next();
		String aadhar=null;
		
		
		while(!(valid.isValidAadharNumber(temp))) {
			System.out.println("Enter value in the form: XXXXXXXXXXXX");
			System.out.println("Enter the Aadhar number: ");
			temp=scan.next();
		}
		
		aadhar = temp;
		
		System.out.println("Enter the Income: ");
		double income=scan.nextDouble();
		System.out.println("Enter the Liability: ");
		double liability=scan.nextDouble();
		System.out.println("Enter the Phone Number: ");
		String tempPhone=scan.next();
		String phone=null;
		
		while(!(valid.isValidPhone(tempPhone))) {
			System.out.println("Invalid number!!!");
			System.out.println("Enter the Phone number: ");
			temp=scan.next();
		}
		
		phone = tempPhone;
		
		System.out.println("Enter the Email Id: ");
		String tempEmail=scan.next();
		String email=null;
		
		while(!(valid.isValidEmail(tempEmail))) {
			System.out.println("Invalid email id!!!");
			System.out.println("Enter the Email: ");
			temp=scan.next();
		}
		
		email=tempEmail;
		
		customer.getPersonal().setPanCard(panCard);
		customer.getPersonal().setPhone(phone);
		customer.getPersonal().setVoterId(aadhar);
		customer.getPersonal().setEmail(email);
		customer.setIncome(income);
		customer.setLiability(liability);
		
	}
	
	
	public void dedupe(Customer customer) {

		customer.setStage(DEDUPE);
		System.out.println("Please wait for the DEDUPE check....");
		boolean isNegativeFound=false;
		int negativeScore=0;
		for(Customer negativeCustomer: defaulter.getNegativeCustomer()) {
			negativeScore=isNegative(customer,negativeCustomer);
			if(negativeScore>40) {
				System.out.println("\n***Customer record found in DEDUPE with score " 
						+ negativeScore +"***");
				isNegativeFound=true;
				break;
			}
		}
		
		if(isNegativeFound) {
//				System.out.println("Do you want to approve this loan ? (Y/N) ");
				customer.setStage(REJECT);
				return;
			
		}
	}
	
	
	public void scoring(Customer customer) {
		//System.out.println("scoring call");
		customer.setStage(SCORING);
		System.out.println("Calculating your score....");
		int score=0;
		double totalIncome=customer.getIncome()-customer.getLiability();
		if(customer.getPersonal().getAge()>=21 && customer.getPersonal().getAge()<=35)
			score+=50;
		if(totalIncome>=200000)
			score+=50;
		customer.getLoanDetails().setScore(score);
		System.out.println("Your Score is: "+score);
	}
	
	
	public void approval(Customer customer) {
		customer.setStage(APPROVAL);
		int score=customer.getLoanDetails().getScore();
		System.out.println("\n\n**************************");
		System.out.println("Application Number: " + customer.getId());
		System.out.println("Name :" + customer.getPersonal().getFirstName() +" " 
		+customer.getPersonal().getLastName());
		System.out.println("Score :"+customer.getLoanDetails().getScore());
		System.out.println("Loan :" + customer.getLoanDetails().getType()+ "\nAmount :"
				+ customer.getLoanDetails().getAmount()+"\nDuration :" +
				customer.getLoanDetails().getDuration());
		System.out.println("**************************");
		double approveAmount=customer.getLoanDetails().getAmount()*(score/100);
		System.out.println("\nYour Loan approve amount is " + approveAmount);
		System.out.println("Do you want to submit application ? ");
		char choice=scan.next().toUpperCase().charAt(0);
		if(choice=='N') {
			customer.setStage(REJECT);
			//customer.setRemarks("customer denied the approved amount of "+approveAmount);
			System.out.println("\nCustomer denied the approved amount of "+approveAmount);
			return;
		}
		else
			customer.setStage(DONE);
		
	}
	
	
	
	public void checkStage(int applicationNumber) {
		boolean isStageFound=false;
		if(customer_list!=null && customer_list.size()>0) {
			for(Customer customer:customer_list) {
				if(customer.getId()==applicationNumber) {
					if(customer.getStage()<7) {
					System.out.println("You are on " + getStageName(customer.getStage()));
					isStageFound=true;
					moveToNextStage(customer);
					break;
					}
				}
			}
		}
		if(!isStageFound)
			System.out.println("Invalid Application Number !!");
	}
	
	
	
	public static String getStageName(int stageId) {
		switch(stageId) {
		case SOURCING :return "Sourcing Stage";
		case QDE: return "Quick Data Entry Stage";
		case DEDUPE: return "Dedupe Stage";
		case SCORING: return "Scoring Stage";
		case APPROVAL: return "Approval Stage";
		case REJECT: return "Rejection Stage";
		default :return "Invalid Stage";
		}
	}
	
	
	private int isNegative(Customer customer,Customer negative) {
		int percentageMatch=0;
		if(customer.getPersonal().getPhone().equals(negative.getPersonal().getPhone())) {
			percentageMatch+=10;
		}
		if(customer.getPersonal().getEmail().equals(negative.getPersonal().getEmail())) {
			percentageMatch+=10;
		}
		if(customer.getPersonal().getVoterId().equals(negative.getPersonal().getVoterId())) {
			percentageMatch+=10;
		}
		if(customer.getPersonal().getPanCard().equals(negative.getPersonal().getPanCard())) {
			percentageMatch+=10;
		}
		if((customer.getPersonal().getAge()==negative.getPersonal().getAge()) && 
			(customer.getPersonal().getFirstName().equalsIgnoreCase(negative.getPersonal().getFirstName()))) {
			percentageMatch+=20;
		}
		return percentageMatch;
	}
	
	
public void moveToNextStage(Customer customer) {
		
		while(true) {
			if(customer.getStage()==SOURCING) {
				System.out.println("\nDo you want to move to the next stage (Y/N): ");
				char choice=scan.next().toUpperCase().charAt(0);
				if(choice=='Y') {
					qde(customer);
				}
				else
					return;
			}
			else if(customer.getStage()==QDE) {
				System.out.println("\nDo you want to move to the next stage (Y/N): ");
				char choice=scan.next().toUpperCase().charAt(0);
				if(choice=='Y') {
					dedupe(customer);
				}
				else
					return;
			}
			
			else if(customer.getStage()==DEDUPE) {
				System.out.println("\nDo you want to move to the next stage (Y/N): ");
				char choice=scan.next().toUpperCase().charAt(0);
				if(choice=='Y') {
					scoring(customer);
				}
				else
					return;
			}
			else if(customer.getStage()==SCORING) {
				System.out.println("\nDo you want to move to the next stage (Y/N): ");
				char choice=scan.next().toUpperCase().charAt(0);
				if(choice=='Y') {
					approval(customer);
				}
				else
					return;
			}
			else if(customer.getStage()==APPROVAL) {
				return;
			}
			else if(customer.getStage()==REJECT) {
				System.out.println("\nLoan has been rejected !!!");
				return;
			}
			else if(customer.getStage()==DONE) {
				System.out.println("Congratulations!!! Your loan has been approved.");
				return;
			}
		}
	}
}