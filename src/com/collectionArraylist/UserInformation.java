package com.collectionArraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UserInformation {
	
	public static void main(String args[]) {
		
		ArrayList<User> user = new ArrayList<User>();
		
		user.add(new User("ganesh","01","Karad",15000.00,"12345"));
		user.add(new User("Dinesh","02","Karad",30000.00,"1260045"));
		user.add(new User("Rohan","03","Karad",50000.00,"1234125"));
		user.add(new User("Aadi","04","Karad",25000.00,"1234517"));
		user.add(new User("Rohit","05","Karad",10000.00,"1234578"));
		
//		
//		for(User u1:user) {
//			
//			System.out.println("Name     :  "  + u1.getUsername());
//			System.out.println("Id       :  "  + u1.getId());
//			System.out.println("Address  :  "  + u1.getAddress());
//			System.out.println("Salary   :  "  + u1.getSalary());
//			System.out.println("Mobileno :  "  + u1.getMobileno());
//			
//			System.out.println("------------");
//			
//		}
		
//		for(int i = 0; i<user.size();i++) {
//			System.out.println(user.get(i));
//		}
//		
		
//		Iterator<User> u1 = user.iterator();
//		while(u1.hasNext()) {
//			System.out.println(u1.next());
//		}
		
		ListIterator<User> r1 = user.listIterator();
		while(r1.hasNext()) {
			System.out.println(r1.next());
		}
		
	}
	
	
	
}
