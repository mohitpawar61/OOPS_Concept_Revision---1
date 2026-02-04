package com.inheritance;

public class School {
	
	String name;
	int num;
	int address;
	
	School(String name , int num , int address){
		
		this.name = name;
		this.num = num;
		this.address = address;
		
	}
	
	
	void method() {
		
		System.out.println("Name : " + name);
		System.out.println("Numbers : " + num);
		System.out.println("Address : " + address);
		
		
	}
	
	
	

}
