package com.collectionLinkedlist;


import java.util.LinkedList;
import java.util.ListIterator;

public class Referbook {
	
	public static void main(String args[]) {
		
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book("Focus on goals","M.M.Stan",400.00,2,"6 folder"));
		books.add(new Book("Filding set","M.K.Stan",100.00,2,"6 folder"));
		books.add(new Book("Goals","M.H.Stan",500.00,2,"6 folder"));
		books.add(new Book("Focus","M.V.Stan",700.00,2,"6 folder"));
		books.add(new Book("New to access","M.T.Stan",200.00,2,"6 folder"));
	
//		ListIterator<Book> b1 = books.listIterator();
//		while(b1.hasNext()) {
//			System.out.println(b1.next());
//		}
		
		
		
//		Iterator<Book> b1 = books.iterator();
//		while(b1.hasNext()) {
//			System.out.println(b1.next());
//		}
//		
		
//		for(int i=0;i<books.size();i++) {
//			System.out.println(books.get(i));
//		}
		
		for(Book b1:books) {
			
			System.out.println(b1.getName());
			System.out.println(b1.getWriter());
			System.out.println(b1.getPrice());
			System.out.println(b1.getPages());
			System.out.println(b1.getContent());
			
			System.out.println("---------");
			
		}
		
	}

}
