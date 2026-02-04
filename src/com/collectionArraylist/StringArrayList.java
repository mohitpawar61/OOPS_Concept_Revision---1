package com.collectionArraylist;
import java.util.ArrayList;


public class StringArrayList {

	public static void main(String args[]) {
		
	ArrayList<String> str = new ArrayList<String>();	
	str.add("Ram");
	str.add("Mohit");
	str.add("Ramcharan");
	str.add("Shubh");
	
	
	for(String s3:str) {
		
		if(s3.startsWith("M")) {
			 String f = null;
			 int count = 0;
			char [] d = s3.toCharArray();
			
			for(int i=0;i<s3.length();i++) {
				
				if(d[i]=='a' || d[i] =='i'|| d[i] == 'e' || d[i] == 'o' || d[i] == 'u') {
					
					f = String.valueOf(d);
					System.out.println(d[i]);
					count ++;
					
					
				}
				System.out.println(count);
			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	for(String s2:str) {
//		
//		if(s2.startsWith("R")||s2.startsWith("M")) {
//		
//			String s = null;
//			 int count = 0;
//			char [] c = s2.toCharArray();
//		
//			for(int i=0;i<s2.length();i++) {
//			
//			if(c[i]=='a' || c[i] =='i'|| c[i] == 'e' || c[i] == 'o' || c[i] == 'u') {
//				 
//				s = String.valueOf(c);
//			System.out.println(c[i]);
//				count++;
//				
//				
//			}
//			System.out.println(count);
//		}
//	
	
//	for(String s1:str) {  
//		
//		if(s1.startsWith("R") || s1.startsWith("M") || s1.startsWith("S")) {
//			String s = null;
//		int count = 0;
//		char [] c = s1.toCharArray();
//			for(int i=0;i<s1.length();i++) {
//				
//				if(c[i] == 'a'|| c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
//					
//					s = String.valueOf(c);
//					
//					
////					System.out.println(c[i]);
//					count ++;
//					
//				}
//				
//				
//			}
//			System.out.println(s + "  Vowels : " + count);
//			
// 
//		
//		}
//		
//	}
	
//	for(String s2:str) {
//		String s = null;
//		if(s2.startsWith("R")|| s2.startsWith("M")) {
//			
//			int count = 0;
//			char [] g = s2.toCharArray();
//			
//			for(int i=0;i<s2.length();i++) {
//			
//			
//				if(g[i] == 'a' || g[i] == 'e' || g[i] == 'i' || g[i] == 'o' || g[i] == 'u') {
//					
//				
//					s= String.valueOf(g);
//					count++;
//				
//				
//				
//				}
//			}
//			System.out.println(s + " Vowels : " + count);
//			
//		}
//		
		
	}
	}
	}	
	}

