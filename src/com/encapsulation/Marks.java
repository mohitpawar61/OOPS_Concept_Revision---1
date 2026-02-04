package com.encapsulation;

public class Marks {
	
	public static void main(String args[]) {
		
		Test m1 = new Test();
		m1.setmarks(50);
		m1.setname("mohit");
		m1.setaddress("Vahagaon");
		m1.setid(15L);
		m1.setsalary(40000.00);
		
		System.out.println(m1.getmarks());
		System.out.println(m1.getname());
		System.out.println(m1.getaddress());
		System.out.println(m1.getid());
		System.out.println(m1.getsalary());
		
		
	}
	

}
