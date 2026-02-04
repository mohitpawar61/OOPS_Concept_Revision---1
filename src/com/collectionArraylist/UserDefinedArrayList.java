package com.collectionArraylist;
import java.util.ArrayList;



public class UserDefinedArrayList {

	public static void main(String args[]) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Mohit","Vahagoan",1));
		students.add(new Student("Rohan","Vahagoan",2));
		students.add(new Student("Harsh","Vahagoan",3));
		students.add(new Student("Neha","Vahagoan",4));
		
	for(Student s1:students) {
		
		System.out.println(s1.getname());
		System.out.println(s1.getaddress());
		System.out.println(s1.getid());
		
		System.out.println("=============");
	}
		
	}
	
	
	
	
}
