package com.interfacee;

public interface Manage {

	static  int num=5;
	
	public abstract void Sigma();
	
	static void d1() {
		System.out.println("Static abstarction");
	}

	default void h1() {
		System.out.println("default method");
		p1();//access the private method
	}
	
	private void p1() {
		System.out.println("User");
	}
	
}
