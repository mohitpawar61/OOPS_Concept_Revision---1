package com.filehandling;

import java.io.File;
import java.io.FileReader;

public class Fileread_delete {

	static void fileReader() {
		try {
		FileReader fr = new FileReader("location");
		
		boolean data;
		 while(data=fr.read() != -1) {
		System.out.println(data);	 
		 }
		}
		 catch(Exception e) {
			 
			 System.out.println(e.getMessage());
		 }
		
	}
		public static void main(String args[]) {
			
			fileReader();
			
			File file = new File("location");
			file.delete();
			
		}
		
		
	
	
	
}
