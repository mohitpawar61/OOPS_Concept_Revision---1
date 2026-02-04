package com.Array;
import java.util.Scanner;

public class PrintEven {

	public static void main(String args[]) {
		
		int [] arr = new int [5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers : ");
		for(int i=0; i<5;i++) {
			
				arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<5;i++) {
			if(i % 2==0) {
		System.out.println("Even numbers : " + i);
			}
		}
		
	}
}
