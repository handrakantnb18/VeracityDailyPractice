package com.day2.zzjava8Examples;

import java.util.LinkedHashMap;

public class LinkedHAshMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Ram");
		map.put(102, "Akash");
		map.put(103, "Prakash");
		map.put(104, "Anil");
		map.put(105, "Pooja");
		
		System.out.println("Employee : "+map);
		
		
	}
}
