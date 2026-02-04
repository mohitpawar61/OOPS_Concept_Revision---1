package com.collectionLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Studentdetails {

	public static void main(String args[]) {
		
		LinkedList<Student> students = new LinkedList<Student>();
		students.add(new Student("Aditya",1,75,"aditya@123","Karad"));
		students.add(new Student("Rohit",2,85,"rohit@123","Karad"));
		students.add(new Student("Harsh",3,55,"harsh@123","Karad"));
		students.add(new Student("Ganesh",4,80,"ganesh@123","Karad"));
		students.add(new Student("Vivek",5,72,"vivek@123","Karad"));
	
		ListIterator<Student> ss = students.listIterator();
		while(ss.hasNext()) {
			System.out.println(ss.next());
		}
		
//		Iterator<Student> ss = students.iterator();
//		while(ss.hasNext()) {
//			System.out.println(ss.next());
//		}
		
		
//		for(int i=0;i<students.size();i++) {
//			System.out.println(students.get(i));
//		}
		
		
//		for(Student ss:students) {
//			System.out.println(ss.getStudentname());
//			System.out.println(ss.getRollno());
//			System.out.println(ss.getAttendance());
//			System.out.println(ss.getEmail());
//			System.out.println(ss.getAddress());
//
//		}
		
		
	}
}
