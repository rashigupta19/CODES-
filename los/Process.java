package los;


import java.util.*;

public class Process implements StageConstants{
	
	private ArrayList<Customer> customers=new ArrayList<>();
	Scanner scan=new Scanner(System.in);
	static int serialCounter=1;
	
	
	public void sourcing() {
		Customer customer =new Customer();
		customer.setId(serialCounter);
		customer.setStage(SOURCING);
		System.out.println("\n\nEnter the FirstName:");
		String firstName=scan.next();
		System.out.println("Enter the LastName:");
		String lastName= scan.next();
		System.out.println("Enter the Age:");
		int age=scan.nextInt();
		System.out.println("Enter the loan type HL,AL,PL:");
		String type=scan.next();
		System.out.println("Enter the amount:");
		double amount=scan.nextDouble();
		System.out.println("Duration of loan (in months) :");
		int duration=scan.nextInt();
		PersonalInformation pd=new PersonalInformation();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		LoanDetails loanDetails=new LoanDetails();
		loanDetails.setType(type);
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		customer.setLoanDetails(loanDetails);
		
		customers.add(customer);
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
		System.out.println("Enter the VoterId: ");
		String voterId=scan.next();
		System.out.println("Enter the Income: ");
		double income=scan.nextDouble();
		System.out.println("Enter the Liability: ");
		double liability=scan.nextDouble();
		System.out.println("Enter the Phone Number: ");
		String phone=scan.next();
		System.out.println("Enter the Email Id: ");
		String email=scan.next();
		customer.getPersonal().setPanCard(panCard);
		customer.getPersonal().setPhone(phone);
		customer.getPersonal().setVoterId(voterId);
		customer.getPersonal().setEmail(email);
		customer.setIncome(income);
		customer.setLiability(liability);
		
	}
	
	
	public void dedupe(Customer customer) {

		customer.setStage(DEDUPE);
		System.out.println("Please wait for the DEDUPE check....");
		boolean isNegativeFound=false;
		int negativeScore=0;
		for(Customer negativeCustomer: Defaulter.getNegativeCustomer()) {
			negativeScore=isNegative(customer,negativeCustomer);
			if(negativeScore>0) {
				System.out.println("\n***Customer record found in DEDUPE with score " 
						+ negativeScore +"***");
				isNegativeFound=true;
				break;
			}
		}
		
		if(isNegativeFound) {
				System.out.println("Do you want to approve this loan ? (Y/N) ");
				char choice=scan.next().toUpperCase().charAt(0);
				if(choice=='N') {
					customer.setStage(REJECT);
				}
				else
				{
					System.out.println("Dedupe done, loan approved");
					return;
				}
			
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
		System.out.println(score);
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
		System.out.println("Do you want to bring this loan or not ? ");
		char choice=scan.next().toUpperCase().charAt(0);
		if(choice=='N') {
			customer.setStage(REJECT);
			//customer.setRemarks("customer denied the approved amount of "+approveAmount);
			System.out.println("\nCustomer denied the approved amount of "+approveAmount);
			return;
		}
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void checkStage(int applicationNumber) {
		boolean isStageFound=false;
		if(customers!=null && customers.size()>0) {
			for(Customer customer:customers) {
				if(customer.getId()==applicationNumber) {
					System.out.println("You are on " + getStageName(customer.getStage()));
					isStageFound=true;
					moveToNextStage(customer);
					break;
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
	
	
	
	
	
	
	
	
	
	
}