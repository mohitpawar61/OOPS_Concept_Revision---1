package com.Array;
import java.util.Scanner;

public class PrintMaxArray {

	public static void main(String args[]) {
		
		
		int arr[] = {12,50,58,45,66};
		int max = arr[0];
		//Scanner sc = new Scanner(System.in);
		
		
		
		
		for(int i = 1; i<arr.length; i++) {
	if(arr[i]>max) {
		max = arr[i];
	}
		}
		System.out.println("Max number of array is : " + max);
	}
}
