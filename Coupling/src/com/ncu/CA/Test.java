package com.ncu.CA;

public class Test { 
	public static void main(String[] args) { 
		SmartWorker sw = new SmartWorker(); 
		LazyWorker lw = new LazyWorker(); 
		ExtraordinaryWorker ew = new ExtraordinaryWorker();
		Manager mn = new Manager(sw, lw,ew); 
		mn.ManageWork(); 
	} }