package com.ncu.project.LoanOrganizationSystem;

import java.io.*;
import java.util.Random;

import org.springframework.stereotype.Component;

import java.util.Map.Entry;


public class NewLoanApply implements ILoanOrganizer{


	private String Fullname;
	private int	Age;
	private	Address add;
	private	PersonalInfo pi;
	private String PhNo;
	private String email;
	private Loan_type loantype;
	private String Education;



	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public String getPhNo() {
		return PhNo;
	}

	public void setPhNo(String phNo) {
		PhNo = phNo;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Loan_type getLoantype() {
		return loantype;
	}



	public void setLoantype(Loan_type loantype) {
		this.loantype = loantype;
	}


	public PersonalInfo getPi() {
		return pi;
	}

	public void setPi(PersonalInfo pi) {
		this.pi = pi;
	}



	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}


	public int generate_AppNo() {
		Random rand = new Random(); 
		int random = rand.nextInt(1000);

		System.out.println("auto generated number application number " + random);
		
		return random;
		
	}


	public int CaculateIncome() {
		int sum1=0;
		int sum2=0;
		for (Entry<String, Integer> entry : pi.getAssets().entrySet()) {
			sum1= sum1+entry.getValue();
		}
		for (Entry<String, Integer> entry :pi.getLiability().entrySet()) {
			sum2 = sum2+entry.getValue();
		}

		int TotalIncome;
		TotalIncome=sum1+pi.getSalary()-sum2;

		System.out.println(+TotalIncome);

		return TotalIncome;

	}
    @Override
	public int ScoreCalculation() {
		int score=0;
		if(getAge()<=20) {
			score+=2;
		}else if (getAge()<30) {
			score+=1;
		}

		if(getEducation().equalsIgnoreCase("graduate")) {
			score +=2;
		}else if(getEducation().equalsIgnoreCase("undergraduate")) {
			score +=1;
		}

		if(CaculateIncome()>=10000) {
			score+=2;
		}else if(CaculateIncome()<10000) {
			score+=2;
		}
		
		return score;
	}

	@Override
	public void UserDetails() {
		// TODO Auto-generated method stub
		try {
			
			int AppNo=generate_AppNo();
			int Income=CaculateIncome();
			File file = new File("C:\\rashi sem 4\\MF & ORM\\Loan.csv"); 
			if ( !file.exists() ) {
				file.createNewFile();
				}

			FileWriter fw = new FileWriter(file);
			BufferedWriter writer = new BufferedWriter( fw );
			writer.write("Application number");
			writer.write(",");
			writer.write("Aadhar"); 
			writer.write(",");
			writer.write("Pan");
			writer.write(",");
			writer.write("Phone number");
			writer.write(",");
			writer.write("Email");
			writer.write(",");
			writer.write("Education");
			writer.write(",");
			writer.write("Income");
			writer.write(",");
			writer.write("Age");
			writer.newLine();

			writer.write(Integer.toString(AppNo)); 
			writer.write(",");
			writer.write(pi.getAadhar());
			writer.write(",");
			writer.write(pi.getPan()); 
			writer.write(",");
			writer.write(getPhNo());
			writer.write(",");
			writer.write(getEmail());
			writer.write(",");
			writer.write(getEducation()); 
			writer.write(",");
			writer.write(Integer.toString(CaculateIncome()));
			writer.write(",");
			writer.write(Integer.toString(getAge()));
			writer.newLine();

			writer.flush();
			writer.close();
			fw.close();
		} 
		catch(IOException e) {
			e.printStackTrace(); 
		}
	}

	@Override
	public void dedupeCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "NewLoanApply [Fullname=" + Fullname + ", Age=" + Age + ", add=" + add + ", pi=" + pi + ", PhNo=" + PhNo
				+ ", email=" + email + ", loantype=" + loantype + ", Education=" + Education + "]";
	}
	



}
