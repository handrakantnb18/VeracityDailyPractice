package com.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemoTwo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(101, "Java");
		lmap.put(102, "Angular");
		lmap.put(103, "Spring");
		lmap.put(104, "MySQL");
		
		System.out.println(lmap);
	}
	
}
