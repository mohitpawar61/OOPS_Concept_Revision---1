package com.exception_handling;
import java.io.*;
import java.util.Scanner;


public class FileNotfound {
	
	public static void main(String args[]) {

		try {
			readFile("test.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
		public static void readFile(String filename) throws FileNotFoundException{
			
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			readFile("test.txt");
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//		public static void readFile(String filename) throws  FileNotFoundException{
//			
//			File file = new File(filename);
//			Scanner sc = new Scanner(file);
//			
//		while(sc.hasNext()) {
//			String line = sc.nextLine();
//			System.out.println(line);
//			System.out.println(sc.next());
//		}
//		
//	  sc.close();
//	}

//	private static void readFile(String string) {
//		// TODO Auto-generated method stub
//		
//	}

}
