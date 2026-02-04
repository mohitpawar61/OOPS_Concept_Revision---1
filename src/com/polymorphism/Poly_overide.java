package com.polymorphism;

public class Poly_overide extends Overriding_{

	@Override
	void method() {
		System.out.println("Pawar");
	}
	
	public static void main(String[]args) {
		
		Overriding_ over= new Overriding_();
		over.method();
		
		Poly_overide poly= new Poly_overide();
		poly.method();
		
	}
	
	
}
