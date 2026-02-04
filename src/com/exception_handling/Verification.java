package com.exception_handling;
import java.util.Scanner;

public class Verification {
	String Mohit;
	void Verify() {
		
		System.out.println("Enter your password : ");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		
		if(password==Mohit) {
			System.out.println("Password is correct");
		}
		else {
			System.out.println("Invalid password please try again!");
			
		}
		
	} 
	
	public static void main(String[]args) {
		
		Verification v1 = new Verification();
		try {
		v1.Verify();
		}
		catch(PasswordNotValidException i) {
			System.out.println(i.getMessage());
		}
	}
	
	
}
