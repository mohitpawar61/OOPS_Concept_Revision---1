package com.interfacee;

public interface Practice {

	static int id = 100;
	
	public abstract void test();
	
	static void lets() {
		
		System.out.println("Lets go");
		
	}
	
	default void game() {
		
		System.out.println("Default method");
	}
	
	
	
}
