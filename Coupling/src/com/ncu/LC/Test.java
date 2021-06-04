package com.ncu.LC;

public class Test { 
	public static void main(String[] args) 
	{ 
		Iworker sw = Factory.getObject() ;
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();
	}

}