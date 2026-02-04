package com.interfacee;

public class demo implements test{

	public void login() {
		
		System.out.println("Success");		
	}
		
public static void main(String []args) {
	
	
	System.out.println(test.id);
	test.m1();
	
	demo d = new demo();
	d.login();
	d.v1();
	
}
	
}
