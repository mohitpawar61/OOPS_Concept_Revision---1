package com.polymorphism;

public class demoover {

	void sample() {
		System.out.println("Nahe");
	}
	
	
	

class Simple extends demoover{
	
	void sample() {
		System.out.println("Pawar");
	}


public static void main(String args[]) {
	
	demoover mahi = new demoover();
	mahi.sample();
	
	
    	
}
}
}