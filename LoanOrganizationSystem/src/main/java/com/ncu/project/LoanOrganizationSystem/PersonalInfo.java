package com.ncu.project.LoanOrganizationSystem;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.springframework.stereotype.Component;

public class PersonalInfo {
    private Validations va;
    private int Salary;
	private LinkedHashMap<String,Integer>Assets;
	private LinkedHashMap<String,Integer>Liability;
	private int Income;
	private String Aadhar;
	private String Pan;
	private int stage;

	
	
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		
		int sum1=0;
		int sum2=0;
		for (Entry<String, Integer> entry :Assets.entrySet()) {
		    sum1= sum1+entry.getValue();
		}
		for (Entry<String, Integer> entry :Liability.entrySet()) {
		     sum2 = sum2+entry.getValue();
		}
		
		int TotalIncome;
		TotalIncome=sum1+getSalary()-sum2;
       this.Income=TotalIncome;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public LinkedHashMap<String, Integer> getAssets() {
		return Assets;
	}
	public void setAssets(LinkedHashMap<String, Integer> assets) {
		Assets = assets;
	}
	public LinkedHashMap<String, Integer> getLiability() {
		return Liability;
	}
	public void setLiability(LinkedHashMap<String, Integer> liability) {
		Liability = liability;
	}

	public String getAadhar() {
		return Aadhar;
	}
	
	public void setAadhar(String aadhar) {
		if(va.isValidAadharNumber(aadhar)==true) {
			this.Aadhar=aadhar;	}
	}

	public String getPan() {
		return Pan;
	}

	public void setPan(String pan) {
		Pan = pan;
	}
	

	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	@Override
	public String toString() {
		return "PersonalInfo [va=" + va + ", Salary=" + Salary + ", Assets=" + Assets + ", Liability=" + Liability
				+ ", Income=" + Income + ", Aadhar=" + Aadhar + ", Pan=" + Pan + "]";
	}
	
	
	
}
