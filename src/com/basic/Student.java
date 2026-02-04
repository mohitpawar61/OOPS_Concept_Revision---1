package com.basic;

public class Student {
   
	String name;
	String address;
	String mobile;
	
//	
//	Student(){
//		
//		System.out.println("Non paramirized constructor");
//	}
//	
	Student(String name,String address,String mobile){
		this.address=address;
		this.mobile=mobile;
		this.name=name;
		System.out.println("Parameterized constructor");
	}
	
	void display(){
		System.out.println("Name : "+ name + " Address :" + address + " Mobile :" +mobile);
	}
	public static void main(String[]args) {
		
		Student s1= new Student("Mohit","vahgaon","7743906955");
		
		s1.display();
	}
	
}
