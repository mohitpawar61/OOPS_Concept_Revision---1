package com.collectionHashset;

import java.util.HashSet;
import java.util.Iterator;


public class CollectionOfBooks {
  
	public static void main(String args[]) {
		
		HashSet<Book> books = new HashSet<Book>();
		books.add(new Book("Focus on goals","M.M.Stan",400.00,2,"6 folder"));
		books.add(new Book("Filding set","M.K.Stan",100.00,2,"6 folder"));
		books.add(new Book("Goals","M.H.Stan",500.00,2,"6 folder"));
		books.add(new Book("Focus","M.V.Stan",700.00,2,"6 folder"));
		books.add(new Book("New to access","M.T.Stan",200.00,2,"6 folder"));
		
		Iterator<Book> cc = books.iterator();
		while(cc.hasNext()) {
			System.out.println(cc.next());
		}
		
		
//		for(Book cs:books) {
//			System.out.println(cs.getName());
//			System.out.println(cs.getWriter());
//			System.out.println(cs.getPrice());
//			System.out.println(cs.getPages());
//			System.out.println(cs.getContent());
//			
//			System.out.println("---------");
//		}
//		
	}
}
