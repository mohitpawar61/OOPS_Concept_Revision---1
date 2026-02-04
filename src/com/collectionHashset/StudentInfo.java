package com.collectionHashset;

import java.util.HashSet;
import java.util.Iterator;


public class StudentInfo {
	
	public static void main(String args[]) {
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("Aditya",1,75,"aditya@123","Karad"));
		students.add(new Student("Rohit",2,85,"rohit@123","Karad"));
		students.add(new Student("Harsh",3,55,"harsh@123","Karad"));
		students.add(new Student("Ganesh",4,80,"ganesh@123","Karad"));
		students.add(new Student("Vivek",5,72,"vivek@123","Karad"));
	
		
		
		
//		Iterator<Student> s1 = students.iterator();
//		while(s1.hasNext()) {
//			System.out.println(s1.next());
//		}
//		
		
		
//		for(Student s1:students) {
//			
//			System.out.println(s1.getStudentname());
//			System.out.println(s1.getRollno());
//			System.out.println(s1.getAttendance());
//			System.out.println(s1.getEmail());
//			System.out.println(s1.getAddress());
//			
//			System.out.println("-----------");
//
//		}
//		for(int i=0;i<students.size();i++) {
//			System.out.println(students.get(i));
//		}
	}

}
