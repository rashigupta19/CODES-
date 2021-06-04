package com.ncu.CA;

class Manager { 
	SmartWorker sw; 
	LazyWorker lw; 
	ExtraordinaryWorker ew;    //add one more object 
	
	//modify constructor public 
	Manager(SmartWorker sw, LazyWorker lw,ExtraordinaryWorker ew) 
	{ 
		this.sw = sw; 
		this.lw = lw; 
		this.ew = ew;//add 
	} 
	public void ManageWork() { 
		sw.work(); 
		lw.work(); 
		ew.work();//make call } } 
	}
}