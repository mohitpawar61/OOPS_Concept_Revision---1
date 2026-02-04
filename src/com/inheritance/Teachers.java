package com.inheritance;

public class Teachers extends School{
	
	String mobileno;
	
	Teachers(String name , int num , int address, String mobileno){
		
		super(name,num,address);
		this.mobileno = mobileno;
	}
	
	void initial() {
		
		System.out.println("MobileNo : " + mobileno);
		
	}

}
