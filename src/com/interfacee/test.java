package com.interfacee;

public interface test {

	static int id = 12;
	
	public abstract void login();
	
	static void m1() {
		System.out.println("static m1");
	}
   
	default void v1() {
		System.out.println("default v1");
	}
	
}
