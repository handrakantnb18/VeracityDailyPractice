package com.day2.zzjava8Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValue {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(111, "Satvik");
		map.put(112, "Samar");
		map.put(113, "samay");
		
		System.out.println("Employees : ");
		
		for(Map.Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println("Key : "+entry.getKey() + 
					", Value : "+entry.getValue());
		}
	}
	
	
}
