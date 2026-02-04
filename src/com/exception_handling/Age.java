package com.exception_handling;
import java.util.Scanner;

public class Age {
	
	void Valid() {
		
		System.out.println("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible for pan card");
		}
		else {
			throw new AgeNotValidException("Your not eligible for pan card");
		}
	}
	
	public static void main(String [] args) {
		
		Age v1 = new Age();
		try {
		v1.Valid();
		}
		catch(AgeNotValidException e) {
			System.out.println(e.getMessage());
		}
	}

}
