package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CoverBook {
	
	public static void main(String args[]) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book("Level of straigth" , 1 , 200.00 , "Mohit" , "5 Units"));
		books.add(new Book("Patience" , 12 , 500.00 , "Mohit" , "5 Units"));
		books.add(new Book("Mindset" , 55 , 400.00 , "Rahul" , "5 Units"));
		books.add(new Book("Durability" , 44 , 400.00 , "Rohit" , "5 Units"));
		books.add(new Book("Focus" , 33 , 300.00 , "Yash" , "5 Units"));
		
		
		for(Book b1:books) {
			System.out.println(b1);
		
//		ListIterator<Book> b1 = books.listIterator();
//		while(b1.hasNext()) {
//			System.out.println(b1.next());
		
		
//		Iterator<Book> b1 = books.iterator();
//		while(b1.hasNext()) {
//			System.out.println(b1.next());
//		
		
//		for(int i= 0; i<books.size();i++) {
//			System.out.println(books.get(i));
//		
		
		
//		for(Book b1 : books) {
			
//			if(b1.getBookname().toLowerCase().startsWith("M")) {
//				
//				System.out.println(" BookName     : "   +     b1.getBookname());
//				System.out.println(" Student Id   : "   +   b1.getid());
//				System.out.println(" Price        : "   +        b1.getprice());
//				System.out.println(" Author Name  : "   +  b1.getauthor());
//				System.out.println(" Syallbus     : "   +     b1.getsyllabus());
//			
//				System.out.println("------------");
		
//				if(b1.getid()<1) {
//				
//				System.out.println(b1.getBookname());
//				System.out.println(b1.getid());
//				System.out.println(b1.getprice());
//				System.out.println(b1.getauthor());
//				System.out.println(b1.getsyllabus());
//			}
//			
//		}
		
		}
	}
	

}
