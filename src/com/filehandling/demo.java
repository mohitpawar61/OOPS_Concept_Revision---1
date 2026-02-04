package com.filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class demo {

	public static void main(String[]args) throws IOException {
		
//		File file = new File("C:\\Users\\shubh\\Downloads\\File Handling\\sample.txt");
//		file.createNewFile();
//		System.out.println("File created");
		
		FileWriter fw = new FileWriter("C:\\Users\\shubh\\Downloads\\File Handling\\sample.txt");
		
		
		
		for(int i=1;i<=100;i++) {
			
			fw.write("\nHello");
			
			
		
			
		}
		
		fw.flush();
		System.out.println("Data write");
	
		
	}
	
	
	
	
	
}
