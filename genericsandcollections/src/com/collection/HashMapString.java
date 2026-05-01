package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapString {

	public static void main(String[] args) {
		
Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 101);
		map.put(2, 102);
		map.put(3, 103);
		map.put(4, null);
		map.put(null, 104);
		map.put(null, 105);
		map.put(5, 106);
		map.put(6, null);
		map.put(7, null);
		map.put(null, 107);


		System.out.println(map);

	}
}
