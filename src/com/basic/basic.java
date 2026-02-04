package com.basic;
import java.util.Scanner;

public class basic {
//first program
	//int main() c 
	//int main() cpp
	
	public static void main(String []args) {
		
//		System.err.println("Mohit");// output in red line
//	System.out.println("Mohit");	
//	int age=51;
//	char mohit='a';
//	double salary=30000.00;
//	float bill=25000.00f;
//	long prn=2264661242016l;
//	boolean male=true;
//	short pincode=4151;
//	byte k=15;
		
//		int age =7;
//		
//		if(age<18) {
//			System.err.println("Your are minor");
//	
//	}
//		if(age>=18 && age<50) {
//			System.err.println("Your are young");
//		}
//		
//		if(age>50) {
//			System.err.println("Your are old");
//		}
//	 
		
//		Scanner sc=new Scanner(System.in);
//		sc.next();
//		sc.nextInt();
//		sc.nextByte();
//		sc.nextBoolean();
//		System.out.println("Enter a value");
//		int value=sc.nextInt();
//		System.out.println("Entered value " + value);
		
//		System.out.println("Enter name : ");
//		String name=sc.next();
//		System.out.println("Entered name : " + name);//read only 
//		System.out.println(name.length());//count the length of string
		
//		System.out.println("Enter Name :" );
//		String Username=sc.next();
//		
//		
//		if(Username.length()<3) {
//			System.out.println("Enter a valid name...it should be at least 5 characters");
//			
//		}
//		if(Username.length()>=5) {
//			System.out.println("Your name :" +Username);
//		}
//		System.out.println("Enter Password :");
//		String password=sc.next();
//		
//		if(password.length()<3) {
//			System.out.println("Your password must be 5 characters");
//			
//		}
//		if(password.length()>=5) {
//			System.out.println("Your password" +password);
//		}
//		if(Username.equals("Aadiandjava") && password.equals("121212")) {
//			System.out.println("Login success");
//			
//		}
//		if(!Username.equals("Aadiandjava") && !password.equals("121212")) {
//			System.out.println("Login Failed");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Age :");
//		int age =sc.nextInt();
//		if(age>=18) {
//			System.out.println("You can drive");
//		}
//		else {
//			System.out.println("You can't drive");
//		}
//			
//		Scanner x= new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int num=sc.nextInt();
//		if(num % 2 ==0) {
//			System.out.println("Number is even");
//		}
//		else {
//			System.out.println("Number is odd");
//		}
		
		
//	double backbalance=2000.00;
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter Deposit Amount :");
//	
//	double Amount=sc.nextDouble();
//	
//	if(Amount>0) {
//		System.out.println("After deposit" + backbalance);
//	}
//	else {
//		System.out.println("invalid amount");
//	}
		
		double bankbalance=3000.00;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit amount");
		
		double amount=sc.nextDouble();
		
		if(amount>0) {
			System.out.println("After deposit :" +bankbalance);
		}
		else {
			System.out.println("invalid amount");
		}
	}			
	}
