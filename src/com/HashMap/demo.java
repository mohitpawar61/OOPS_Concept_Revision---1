package com.HashMap;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class demo {
	
	public static void main(String args[]) {
		
		HashMap<String,String> hashmap = new HashMap<>();
		
		hashmap.put("Mohit", "Java developer");
		hashmap.put("Ganesh", "Java developer");
		hashmap.put("Om", "Java developer");
		hashmap.put("Rohit", "Java developer");
		
		Set<Entry<String,String>> entrySet =hashmap.entrySet();
		for(Entry <String,String> ss : entrySet) 
			if(ss.getValue().equals("Java developer")) {
				System.out.println(ss.getKey());
			}
		
	}
	

}
