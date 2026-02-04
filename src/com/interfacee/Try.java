package com.interfacee;

public class Try implements Practice {

	public void test() {
		System.out.println("It's Public");
		
	}
	
	public static void main (String args[]) {
		
		System.out.println(Try.id);
		Practice.lets();
		
		Try t1 = new Try();
		t1.test();
		t1.game();
		
		
	}
	
	
}
