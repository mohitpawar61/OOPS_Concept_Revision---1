package com.inheritance;

public class Student extends human {
	
	
	String StudentId;
	
	Student(int age,String name,String address,String StudentId){
		
		super(age,name,address);
		
		this.StudentId=StudentId;
		
	}
	void showStudentId() {
		
		System.out.println("StudentId :"+StudentId);
	}
}

	

