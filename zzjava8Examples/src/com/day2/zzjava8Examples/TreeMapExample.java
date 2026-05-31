package com.day2.zzjava8Examples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(01, "Shree");
		map.put(02, "Ganesh");
		map.put(03, "Vinayak");
		map.put(04, "Ram");
		
		System.out.println("Employee : "+map);
		
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		map1.put(01, "Shree");
		map1.put(02, "Ganesh");
		map1.put(03, "Vinayak");
		map1.put(04, "Ram");
		
		System.out.println("Employees are : ");
		
		for(Map.Entry<Integer, String> entry : map1.entrySet())
		{
			System.out.println("Id : "+ entry.getKey() +
							", Name : "+entry.getValue());
		}
		
		
	}
}
