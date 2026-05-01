package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 101);
		map.put(2, 102);
		map.put(3, 103);
		map.put(4, 104);
		
		System.out.println(map);
		
	}
}
