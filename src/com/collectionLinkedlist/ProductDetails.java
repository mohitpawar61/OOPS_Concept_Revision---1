package com.collectionLinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ProductDetails {

	public static void main(String args[]) {
		
		LinkedList<Product> products = new LinkedList<Product>();
		
		products.add(new Product("Vivo",15000.00,"Camera",1,"1"));
		products.add(new Product("Realme",20000.00,"Camera,Interior",2,"1"));
		products.add(new Product("MI",12000.00,"Camera",1,"1"));
		products.add(new Product("Oppo",25000.00,"Camera,Screen size,Design",3,"1"));
		products.add(new Product("Iphone",55000.00,"Camera,Body,Design",3,"1"));
	
		ListIterator<Product> p1 = products.listIterator();
		while(p1.hasNext()) {
			System.out.println(p1.next());
		}
		
		
		
//		Iterator<Product> p1 = products.iterator();
//		while(p1.hasNext()) {
//			System.out.println(p1.next());
//		}
//		
		
		
//		for(int i = 0;i<products.size();i++) {
//			System.out.println(products.get(i));
//		}
//		
		
		
//		for(Product p1:products) {
//			
//			System.out.println(p1.getName());
//			System.out.println(p1.getPrice());
//			System.out.println(p1.getDetails());
//			System.out.println(p1.getIngrediant());
//			System.out.println(p1.getQuatity());
//			
//			System.out.println("----------");
//			
//		}
		
		
		
		
	}
}
