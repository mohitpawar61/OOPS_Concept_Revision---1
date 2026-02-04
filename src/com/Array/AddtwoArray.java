package com.Array;

import java.util.Scanner;

public class AddtwoArray {

	public static void main(String args[]) {
		
		int arr1 []= new int[5];
		int arr2 []= new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 5 number of first array");
		for(int i = 0 ; i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
			
		}
		System.out.println("Enter a 5 number of second array");
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Addition of 2 arrays with same index is :");
		for(int i = 0 ; i<5;i++) {
		System.out.println(arr1[i] + " + " + arr2[i] + " = " + (arr1[i]+arr2[i]));
	}
}
}
