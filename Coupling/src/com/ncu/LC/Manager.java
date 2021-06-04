package com.ncu.LC;

class Manager
{ 
	Iworker worker; //Interface Object
	public Manager(Iworker worker) 
	{ 
		this.worker=worker; 
	} 
	public void ManageWork() 
	{ 
		this.worker.work(); 
	} 
} 
