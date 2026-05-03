package com.collection;

import java.util.HashMap;
import java.util.Map;

import com.pojoclasses.Employee;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 101);
		map.put(2, 102);
		map.put(3, 103);
		map.put(4, 104);
		
		System.out.println(map);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Chandraaknt");
		map1.put(2, "Priyanka");
		map1.put(3, "Chandraaknt");
		
		System.out.println(map1);
		
		
	}
}
