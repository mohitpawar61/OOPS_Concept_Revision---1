package com.Array;
import java.util.Scanner;

public class ArrayAdd {

	public static void main(String args[]) {
		
		
		int [] add = new int [5];
		Scanner sc = new Scanner(System.in);
	   int	sum = 0;
		System.out.println("Enter the 5 numbers do you want add" );
		for(int i = 0 ; i<5;i++) {
			
			add[i]=sc.nextInt();
			sum += add[i];
			
			
		}
		System.out.println("Sum = " + sum);
		
	}
	
	
	
}
