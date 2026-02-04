package com.basic;

public class Class_Product {
  
	int pid;
	String name;
	double price;
	int quatity;
	
	public static void main(String[] args) {
	
		Class_Product p1=new Class_Product();
		p1.name="Gemini";
		p1.price=100.00;
		p1.pid=124;
		p1.quatity=1;
		
		System.out.println(p1.name);
		System.out.println(	p1.price);
		System.out.println(p1.pid);
		System.out.println(p1.quatity);
		
		
		Class_Product p2=new Class_Product();
		p2.name="Sunscreen";
		p2.price=100.00;
		p2.pid=124;
		p2.quatity=1;
		System.out.println(p2.name);
		System.out.println(	p2.price);
		System.out.println(p2.pid);
		System.out.println(p2.quatity);
		
		
		Class_Product p3=new Class_Product();
		p3.name="Watch";
		p3.price=100.00;
		p3.pid=1245;
		p3.quatity=2;
		System.out.println(p3.name);
		System.out.println(	p3.price);
		System.out.println(p3.pid);
		System.out.println(p3.quatity);
		
	}
}
