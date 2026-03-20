package com.map;

import java.util.HashMap;

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
		
		System.out.println(map);
		
//		System.out.println(map);
	}
}
