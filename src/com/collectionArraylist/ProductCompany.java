package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ProductCompany {
	
	public static void main(String args[]) {
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product("Sunscreen",1,100.00,"Cream",2));
		product.add(new Product("Powder",2,20.00,"Cream",2));
		product.add(new Product("Medicine",3,500.00,"Cream",2));
		product.add(new Product("Body Spray",4,400.00,"Cream",2));
		product.add(new Product("face wash",5,200.00,"Cream",2));
	
		
//		for(Product p1:product) {
//		
//			System.out.println(p1.getCompanyname());
//			System.out.println(p1.getNoofproducts());
//			System.out.println(p1.getprice());
//			System.out.println(p1.getflavour());
//			System.out.println(p1.getpurchase());
//			
//			System.out.println("-------------");
//		}
		
//		for(int i=0;i<product.size();i++) {
//			System.out.println(product.get(i));
//		}
		
//		Iterator<Product> p1 = product.iterator();
//		while(p1.hasNext()) {
//			System.out.println(p1.next());
//		}
		
		ListIterator<Product> p2 = product.listIterator();
		while(p2.hasNext()) {
			System.out.println(p2.next());
		}
		
	}
	
	

}
