package com.Array;
import java.util.Scanner;

public class OnlyEven {

	public static void main(String args[]) {
		
		int even [] = new int [5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter The 5 Numbers ");
		
		for(int i = 0; i<even.length;i++) {
			even[i] = sc.nextInt();
		}
		
		for(int i = 0; i<even.length;i++) {
			
			if (even[i] % 2 == 0) {
				sum += even[i];
			}
			
		}
		System.out.println("Addition of Even numbers :  " + sum);
	}
}
