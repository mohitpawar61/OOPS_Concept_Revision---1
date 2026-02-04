package com.Array;

public class PrintMinArray {
	
	public static void main(String args []) {
		
		int arr[] = {10,58,75,88,45};
		int min = arr[0];
		
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
			
		}
		System.out.println("Min number of this array is : " + min);
		
	}

}
