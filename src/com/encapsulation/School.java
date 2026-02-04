package com.encapsulation;

public class School {

	public static void main(String[]args) {
		
		Student s1 = new Student();
		
		s1.setid("12");
		s1.setname("Mohit");
		s1.setstandard("Final year");
		s1.setmobileno("1234569");
		
		System.out.println(s1.getid());
		System.out.println(s1.getname());
		System.out.println(s1.getstandrad());
		System.out.println(s1.getmobileno());
		
	}
	
}
