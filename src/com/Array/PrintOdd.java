package com.Array;

import java.util.Scanner;

public class PrintOdd {
	
	public static void main(String args []) {
		
		int arr [] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 5 numbers do you want");
		for(int i = 0 ; i < 5 ; i++ ) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			if( arr[i] % 2 != 0) {
				System.out.println("Odd numbers is : " + arr[i]);
			}
		}
	}

}
