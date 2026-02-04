package com.basic;
import java.util.Scanner;
public class Assignment {
  public static void main(String []args) {
	  
	Scanner sc= new Scanner(System.in);
	//	System.out.println("Enter the number");
//	int number=sc.nextInt();	
	//Write a program to check whether a number is positive, negative or zero using if-else.
//	if(number > 0) {
//		System.out.println("Number is positive");
//		}
//	else if(number<0){
//	System.out.print("Number is negative");
//	}else{
//		System.out.println("Number is zero");
//	}
//	}
//}
	
	//Write a program to check if a person is eligible to vote (age >= 18).
//	System.out.println("Enter the age");
//	int age =sc.nextInt();
//	
//	if(age>=18) {
//		System.out.println("Your eligible for voting");
//	}else {
//		System.out.println("Your not eligible for voting");
//	}
//  }
//}
	
	//Write a program to check if a number is even or odd without using % operator.
//	System.out.println("Enter a number");
//	int number=sc.nextInt();
//	
//	if(number % 2 == 0) {
//		System.out.println("Number is even");
//	}else {
//		System.out.println("Number is odd");
//	}
//  }
//}
	
	//Write a program to find the largest of two numbers using if-else.
//	System.out.println("Enter the first number");
//	int num1=sc.nextInt();
//	System.out.println("Enter the Second number");
//	int num2=sc.nextInt();
//	
//	if(num1>num2) {
//		System.out.println("Largest number is: " + num1);
//	}else if(num2>num1) {
//			System.out.println("Largest number is: "+ num2);
//		}else {
//			System.out.println("Both Numbers is equal");
//		}
//		
//	}
//	
//}
	//Write a program to find the largest of three numbers using nested-if.
//	System.out.println("Enter the first number");
//	int num1=sc.nextInt();
//	System.out.println("Enter the second number");
//	int num2=sc.nextInt();
//	System.out.println("Enter the third number");
//	int num3=sc.nextInt();
//	int largest;
//	if(num1>num2) {
//	if(num1>num3) {
//		largest = num1;
//	}
//	else {
//		largest = num3;
//	}
//	}else {
//		if(num2>num3) {
//			largest=num2;
//		}else {
//			largest = num3;
//			
//		}
//	}
//		System.out.println("The largest number is: " + largest);
//	}
//	}

	//Write a program to check whether a year is a leap year using if-else.
//	 System.out.println("Choose a year");
//	 int year=sc.nextInt();
//	 
//	 if(year % 4 ==0) {
//		 System.out.println("Is a leap year"+ year);
//	 }else {
//		 System.out.println("Not a leap year"+year);
//	 }
//  }
//}
//	int i = 10;
//	for(i=1;i<=5;i++) {
	//	System.out.println(i);
	
//Write a program to check whether a character is vowel or consonant using else-if
	
//	System.out.println("Enter a character");
//	char ch=sc.next().charAt(0);
//	 ch = Character.toLowerCase(ch);
//	
//	
//	if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') 
//		System.out.println("Is a vowel "+ ch);
//		
//	else if(ch>='a'|| ch<='z') {
//		System.out.println("is a consonant "+ ch);
//	}else {
//		System.out.println("Invalid input! Not an alphabet");
//	}


	//Write a program to check if a number is divisible by both 3 and 5 using nested-if.

//	System.out.println("Enter a number");
//  int number=sc.nextInt();
//
//if(number % 3 == 0) 
//	System.out.println("Number is divisible by 3");
//else if(number % 5 ==0) {
//	System.out.println("Number is divisible by 5");
//}else {
//	System.out.println("Number are not divisible by 3 & 5");
//}
  
//Write a program to check whether a student has passed or failed (marks >= 35).
//	
//	System.out.println("Enter your marks");
//	int marks=sc.nextInt();
//	
//	if(marks>=35) {
//		System.out.println("Pass");
//	}
//	else {
//		System.out.println("Fail");
//	}
	
	//10. Write a program to assign grade: A (>=90), B (>=75), C (>=60), D (>=35), else Fail.
	
//	System.out.println("Enter your marks");
//	int marks=sc.nextInt();
//	
//	if(marks>=90) 
//		System.out.println("Congratulations Your Passed With Grade 'A'");
//		
//	else if(marks>=75) {
//			System.out.println("Congratulations Your Passed With Grade 'B'");
//		}
//	else if(marks>=60) {
//			System.out.println("Congratulations Your Passed With Grade 'C'");
//		}
//	else if(marks>=35) {
//			System.out.println("Congratulations Your Passed With Grade 'D'");
//		}
//	else {
//			System.out.println("Your result is fail");
//		}
//		
	
//Write a program to check whether a character is uppercase, lowercase, digit, or special symbol using else-if.
	
//	System.out.println("Enter a character");
//	char ch=sc.next().charAt(0);
//	
//	if(ch>= 'A' && ch<= 'Z') 
//		System.out.println("Is a uppercase " + ch);
//	
//	else if(ch>= 'a' && ch<= 'z') {
//		System.out.println("Is a lowercase " + ch);
//	}
//	else if(ch>='0'&& ch<='9') {
//		System.out.println("Is a digit " + ch);
//	}
//	else {
//		System.out.println("Is a special character " + ch);
//	}
//	
	
	//12. Write a program to check if a number lies between 1 and 100 using nested-if.

//	System.out.println("Enter a number");
//	int num=sc.nextInt();
//	
//	if(num>1) 		
//	 if(num<=100) {
//		 System.out.println("Number lies between 1 to 100 " + num );
//	}
//	else {
//		System.out.println("Is greater than 100 " + num);
//	}
//	else {
//		System.out.println("Is less than 1 " + num );
//	}
		
	//Write a program to check whether three angles form a valid triangle (sum == 180).
	
//	System.out.println("Enter angle 1: ");
//	int a1=sc.nextInt();
//	
//	System.out.println("Enter angle 2: ");
//	int a2=sc.nextInt();
//	
//	System.out.println("Enter angle 3: ");
//	int a3=sc.nextInt();
//	
//	if(a1+a2+a3==180) 
//		System.out.println("Angle is valid for triangle ");
//	
//	else if(a1+a2+a3 !=180) {
//	System.out.println("Angle is not valid for triangle ");	
//	}
//	else {
//		System.out.println("Angle is must be postive ");
//	}
//	
	//14. Write a program to validate a password:  length >= 8, contains a digit, contains a letter (use nested-if).
	// create a string pass , asign the boolean variable true or false , create a if loop asign the condition,
	//create for loop condition charAt() , 
	
//	System.out.println("Enter a Password");
//	String Password=sc.nextLine();
//	boolean digit=false;
//	boolean letter=false;
//	
//	
//	
//	if(Password.length()>=8) {
//		
//		
//		for (int i=0;i< Password.length();i++) {
//			char ch=Password.charAt(i);
//			
//		if(Character.isDigit(ch)) {
//				digit=true;
//			}
//			if(Character.isLetter(ch)) {
//				letter=true;
//		}
//	}
//	if(digit) {
//		if(letter) {
//			System.out.println("Valid password!");
//		}else {
//			System.out.println("Invalid! Password must contain at least one letter");
//		}
//	}
//		else {
//			System.out.println("Invalid! Password must contain at least one digit");
//		}
//  }
//
//  else {
//	  System.out.println("Invalid! Password must be at least 8 characters long.");
//	
//  
//  }

	//Write a program to compare two strings and print which one is lexicographically larger.
	//create a string and compareto method create
	//
	
//	System.out.println("Enter a first string");
//	String s1=sc.nextLine();
//	
//	System.out.println("Enter a second string");
//	String s2=sc.nextLine();
//	
//	int result=s1.compareTo(s2);
//	
//	if(result>0) {
//		System.out.println(s1+" is lexicographically larger "+s2);
//	}
//	else if(result<0){
//		System.out.println(s1+" is lexicographically smaller than "+s2);
//	}
//	else {
//		System.out.println("Both strings are equal lexicographically");
//	}
	
	//Write a program to calculate electricity bill using slab system (use multiple else-if).
	//0–100 units: ₹5 per unit
	//101–200 units: ₹7 per unit
	//201–300 units: ₹10 per unit
	//Above 300 units: ₹12 per unit
	
//	System.out.println("Enter a unit consumed");
//	int unit=sc.nextInt();
//	
//	double bill=0;
//	
//	if(unit<=100) {
//		bill = unit*5;
//	}
//	else if(unit<=200) {
//		bill = (100 * 5) + (unit - 100) * 7;
//	}
//	else if(unit<=300) {
//		 bill = (100 * 5) + (100 * 7) + (unit - 200) * 10;
//	}
//	else  {
//		 bill = (100 * 5) + (100 * 7) + (100 * 10) + (unit - 300) * 12;
//	}
//	
//	System.out.println("Tatal Electricity bill: " +bill);
//	
	
	//17. Write a program to check loan eligibility: salary > 30000, age >= 21, credit score >= 700 (use nested-if).
	
	System.out.println("Check Your loan eligibility");
	System.out.println("Enter your salary");
	double salary =sc.nextDouble();
	System.out.println("Enter your age");
	int age=sc.nextInt();
	System.out.println("Enter your creditscore");
	int creditScore=sc.nextInt();
	
	if(salary>30000) {
		 if(age>=21) {
	 if (creditScore>=700) {
		 System.out.println("Your are eligible for loan: ");
	 }
	else {
		System.out.println("Not eligible: Your salary is not efficient for loan");
	}
	}
	 else {
		 System.out.println("Not eligible: Your age must be at least 21.");
	 }
  }
  else {
	  System.out.println("Not eligible: Your credit score must be at least 700");
	
  }
  
  }
}



	

