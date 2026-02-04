package com.inheritance;

public class College extends Student{

	int CollegeRollno;
	
	   College(int age,String name,String address,String StudentId,	int CollegeRollno){
		   
		   super(age,name,address,StudentId);
		   
		   this.CollegeRollno=CollegeRollno;
		   
	   }
	   
	   void CollegeRollNo() {
		   
		   System.out.println("CollegeRollNo :"+ CollegeRollno);
	   }
	   }