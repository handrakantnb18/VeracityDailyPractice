package com.map;

import java.util.HashMap;

public class HashTableDemoTwo {

	public static void main(String[] args) {
		
		HashMap< Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Chandrakant");
		map.put(2, "priyanka");
		map.put(3, "Ram");
		map.put(4, "Vijay");
		
		System.out.println(map);
	}
}
