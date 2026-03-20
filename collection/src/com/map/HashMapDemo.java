package com.map;

import java.security.KeyStore.Entry;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Chandrakant", "Youtuber");
		map.put("priyanka", "vodafone");
		map.put("Ram", "Youtuber");
		map.put("Chandrakant", ".net");
		map.put(null, "Html"); // only one null key allowed
		map.put("Vijay", null); // multiple value null allowed
		map.put("sachin", null);
		
		// check the hashmap methods -- LinkedHashMap, TreeMap, HashTable
//		System.out.println(map.size());
		
//		System.out.println(map.keySet()); // keys
		
//		System.out.println(map.values()); // values
		
//		System.out.println(map.isEmpty());
		
//		map.clear(); // remove all entries from map
		
//		System.out.println(map.isEmpty()); // to check the map is empty or not
		
//		System.out.println(map.get("Ram")); // key to get the value
		
//		map.remove("Ram"); // remove the key data
		
//		map.replace("Ram", "Software");
		
//		System.out.println(map.containsKey("Youtuber"));
		
		
		// ALT + SHIFT + L
//				 Set<java.util.Map.Entry<String, String>> entrySet = map.entrySet();
//				
//				 for(java.util.Map.Entry<String, String> data : entrySet)
//				 {
//					 System.out.println(data.getKey() + " = "+data.getValue());
//				 }
//				
		
//		 Set<java.util.Map.Entry<String, String>> entrySet = map.entrySet();
			
		 for(java.util.Map.Entry<String, String> data : map.entrySet())
		 {
			 System.out.println(data.getKey() + " = "+data.getValue());
		 }
		
		
//		System.out.println(map);
//		System.out.println(map);
	}
}
