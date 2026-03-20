package com.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	
	public static void main(String[] args) {
		
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("Chandrakant", "Youtuber");
		map.put("priyanka", "vodafone");
		map.put("Ram", "Youtuber");
		map.put("Chandrakant", ".net");
		// map.put(null, "Html"); // only one null key allowed
		// map.put("Vijay", null); // multiple value null allowed
		// map.put("sachin", null);
		
	}
}
