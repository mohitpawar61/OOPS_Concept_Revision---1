package com.exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Balance {

	void CheckBalance() {
		System.out.println("Enter Your withdraw amount : ");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		
		
		
		if(salary<=10000) {
			
	       System.out.println("Withdraw success , Your balance is:");
		}
		else {
			throw new InsufficientBalanceException("Insufficient balance");
		}
	}
		
		public static void main(String []args) {
			
           Balance  b1 = new Balance();
           try {
        	   b1.CheckBalance();
           }
           catch(InsufficientBalanceException e) {
        	   System.out.println(e.getMessage());
           }
		}
	
	
	}


//System.out.println("Enter your age");
//Scanner sc = new Scanner(System.in);
//try {
//int age = sc.nextInt();
//
//System.out.println("Age:" + age);
//} catch(InputMismatchException e) {
//	System.out.println(e.getMessage());
//}
//System.out.println("Hello");
//}