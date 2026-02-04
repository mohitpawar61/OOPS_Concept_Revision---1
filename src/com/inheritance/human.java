package com.inheritance;

public class human {

	int age;
	String name;
	String address;
	
	human(int age,String name,String address){
	
		this.age=age;
		this.name=name;
		this.address=address;
		
	}
	
	void showHuman() {
		
		System.out.println("Age :" + age);
		System.out.println("Name :" +name);
		System.out.println("address :" +address);
	}
	
	}
