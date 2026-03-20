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
		
		
		System.out.println(map);
	}
}
