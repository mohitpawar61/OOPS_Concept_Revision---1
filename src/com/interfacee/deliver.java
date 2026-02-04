package com.interfacee;

public class deliver implements Manage {

	public void Sigma() {
		
		System.out.println("Public is complasary");
	}
	
	public static void main(String[]args) {
		
		System.out.println(Manage.num);
		Manage.d1();
		
		deliver f1 = new deliver();
		f1.Sigma();
		f1.h1();
		
	}
	
	
}
