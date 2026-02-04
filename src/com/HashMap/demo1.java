package com.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class demo1 {
	
	public static void main(String args[]) {
		
		HashMap<String,String> hashmap = new HashMap<>();
		
		hashmap.put("Mohit", "Student");
		hashmap.put("Rohit", "Student");
		hashmap.put("Rohan", "Student");
		hashmap.put("Gana", "Student");
		hashmap.put("Om", "Student");
		
		Set<Entry<String,String>> entryset = hashmap.entrySet();
		for(Entry<String,String> ss:entryset)
			if(ss.getValue().equals("Student")) {
				System.out.println(ss.getKey());
				System.out.println(ss.getValue());
			}

	
	}
}
