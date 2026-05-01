package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapInteger {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Chandrakant");
		map.put(2, "Priyanka");
		map.put(3, "Keshav");
		map.put(4, null);
		map.put(null, "Ram");
		map.put(null, "Rama");
		map.put(5, null);

		System.out.println(map);
		
	}
}
