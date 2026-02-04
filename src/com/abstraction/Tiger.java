package com.abstraction;

public class Tiger extends Animal {

	void sound(String voice) {
		
		System.out.println("Gur");
		
		
	}
	
	public static void main(String[]args) {
		
		Lion l1 = new Lion();
		
		l1.sound("durkali");
		
		Tiger t1= new Tiger();
		
		t1.sound("Gur");
		
	}
	
	
}
