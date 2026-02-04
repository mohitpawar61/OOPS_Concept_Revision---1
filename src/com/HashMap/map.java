package com.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class map {
	
	public static void main(String args[]) {
		
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		
		hashmap.put(1,25);
		hashmap.put(2,25);
		hashmap.put(3,25);
		hashmap.put(4,25);
		hashmap.put(5,25);
		
//		hashmap.isEmpty();
//		hashmap.clear();
//		hashmap.remove(5);
//		hashmap.replace(4, 8);
//		hashmap.get(1);
//		hashmap.values();
//		hashmap.keySet();
//		hashmap.size();
		
		Set<Entry<Integer,Integer>> set = hashmap.entrySet();
		for(Entry<Integer,Integer> ss :set)
			if(ss.getKey().equals(2)) {
				System.out.println(ss.getValue());
			}
		
	}

}
