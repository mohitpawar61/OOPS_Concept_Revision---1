package com.basic;
import java.util.Scanner;
public class Whileloop {
public static void main(String []args) {
	
	int pin=1234;
	Scanner sc= new Scanner(System.in);

	double balance=5000.00;
	int attempt=0;
	
	while(attempt<3) {
		System.out.println("Enter your pin ");
		int userPin=sc.nextInt();
		
	if(userPin==pin) {
		System.out.println("Login success...");
		
		while(true) {
			System.out.println("Check balance");
			System.out.println("Deposit");
			System.out.println("Withdraw");
			System.out.println("Exit");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
		
	 if(choice==1) {
		System.out.println("Your bank balance is :" +balance);
	 }
		else if(choice==2) {
			System.out.println("Enter your deposit amount" + balance);
			double deposit=sc.nextDouble();
		
	 if(deposit>0) {
		balance += deposit;
		System.out.println("Deposit success...New bank balance" + balance);
	 }else {
		 System.out.println("Invalid amount");
	 }
		}
		else if(choice==3) {
			System.out.println("Enter your withdraw amount");
		double Withdraw=sc.nextDouble();
			
		if(Withdraw>0) {
			
		if(Withdraw <= balance) {
			balance -= Withdraw;
			System.out.println("Withdraw success... new bank balance" + balance);
		}
		else {
			System.out.println("Insufficient funds");
		}
		}
		else {
			System.out.println("Invalid amount");
		
		}
		
	}
		else if(attempt==4) {
		System.out.println("Multiple attempts...Your account is Blocked!!!"+ (attempt-3));
	break;
		}
	}
}
	break;
	
	}
	
}
}