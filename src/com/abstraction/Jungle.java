package com.abstraction;

public class Jungle extends Animal {
	
	void sound(String voice) {
		
	System.out.println("Suiii");
	}
	
	public static void main(String args[]) {
		Jungle j1 = new Jungle();
		j1.sound(null);
	}
}
