package com.day2.zzjava8Examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHAshMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Ram");
		map.put(102, "Akash");
		map.put(103, "Prakash");
		map.put(104, "Anil");
		map.put(105, "Pooja");
		
		System.out.println("Employee : "+map);
		
		System.out.println("=====================");
		
		
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(101, "Ram");
		map1.put(102, "Akash");
		map1.put(103, "Prakash");
		map1.put(104, "Anil");
		map1.put(105, "Pooja");
		
		System.out.println("Empolyees : ");
		
		for(Map.Entry<Integer, String> entry : map1.entrySet())
		{
			System.out.println("Id : "+ entry.getKey() + 
								", Name : "+entry.getValue());
		}
	}
}
