package com.encapsulation;

public class demo {
	
	

	public static void main(String[]args) {
		
		Employee e1 = new Employee();
		
		e1.setid("1");
		e1.setname("Mohit");
		e1.setgender("Male");
		e1.setsalary(50000.00);
		e1.setaddress("Vahagaon");
		
		
		System.out.println(e1.getid());
		System.out.println(e1.getaddress());
		System.out.println(e1.getgender());
		System.out.println(e1.getname());
		System.out.println(e1.getsalary());
	    
		
	}
	
	
}
