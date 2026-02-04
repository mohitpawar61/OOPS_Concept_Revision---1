package com.exception_handling;
import java.util.Scanner;

public class InsufficientBalanceException extends RuntimeException {

	 public InsufficientBalanceException(String msg) {
		 
		 super(msg);
	
	
	}
	
	
}
//System.out.println("Enter your balance: ");
//Scanner sc = new Scanner(System.in);
//double salary = sc.nextDouble();
//
//
//
//if(salary<=10000) {
//	try {
//   System.out.println("Your Balance is:");
//}
//	catch( ) {
//		
//	}
//}