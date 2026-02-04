package com.Array;

import java.util.Scanner;

public class OnlyAddOdd {
	
	public static void main(String args []) {
		
		int odd [] = new int [5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the 5 numbers ");
		
		for(int i = 0 ; i < odd.length; i++) {
			odd[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i < odd.length ; i++ ) {
			if(odd[i] % 2 != 0) {
				sum += odd[i];
			}
		}
		System.out.println("Addition of odd numbers is : " + sum);
	}

}
