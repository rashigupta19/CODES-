package los;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Process process=new Process();
		System.out.println("\t\t\t **WELCOME USER**");
		while(true) {
		System.out.println("\nWhat is your Application Number ? \npress 0 if new customer \npress -1 to exit ");
		int applicationNumber=scan.nextInt();
		if(applicationNumber==-1) {
			System.out.println("\n\t\t\t**Thanks for using**");
			System.exit(0);
		}
		if(applicationNumber==0) {
			//new customer
			process.sourcing();
		}
		else {
			//existing customer
			process.checkStage(applicationNumber);
		}
		}
	}

}