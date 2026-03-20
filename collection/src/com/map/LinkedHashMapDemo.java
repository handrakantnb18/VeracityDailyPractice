package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		
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
