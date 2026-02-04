package com.Array;

import java.util.Scanner;

public class DemoArray {

	public static void main(String []args) {
		
		String [] names = new String [3];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<names.length;i++) {
		
			System.out.println("Enter value of index : " + i);
			  names[i]= sc.next();
			
			
		}
		System.out.println("Enter a array elements : " );
		
		for(int i=0;i<names.length;i++) {
			
			System.out.println("Value of index :" + i +  names[i]);
		}
		
	}
	
	
}
