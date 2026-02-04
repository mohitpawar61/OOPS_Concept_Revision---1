package com.basic;
import java.util.Scanner;
public class if_else {
   
	public static void main(String[]args) {
		
	
	Scanner sc=new Scanner(System.in);
    double bankbalanace=2000.00;
	
	System.out.println("1.Deposit");
	System.out.println("2.Withdraw");
	System.out.println("3.Exit");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	
	if(choice == 1) {
		System.out.println("Enter your amount you want deposit " );
		double deposit=sc.nextDouble();
	
	if(deposit>0) {
		deposit += bankbalanace;
		System.out.println("new bank balanace :"+ bankbalanace);
		
	}
	else {
		System.out.println("Invalid amount");
	}
	
	}
	else if(choice==2) {
		System.out.println("Enter your withdraw amount");
		double withdraw=sc.nextDouble();
		
		if(withdraw>0) {
			if(withdraw <= bankbalanace) {
				withdraw -= bankbalanace;
				System.out.println("Your balanace is :" + bankbalanace);
			}
			else {
				System.out.println("Invalid amount");
			}
		}
		else if(choice==3) {
			System.out.println("thank you");
		}
		else {
			System.out.println("Invalid choice");
		}
	}
	}
}
