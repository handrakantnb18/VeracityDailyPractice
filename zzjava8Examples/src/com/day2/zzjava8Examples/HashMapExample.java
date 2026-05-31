package com.day2.zzjava8Examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Ram");
		map.put(2, "Akash");
		map.put(3, "Pranita");
		map.put(4, "Sam");
		
		System.out.println("Student : "+map);
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Shivraj");
		hm.put(102, "Chandrakant");
		hm.put(103, "Smith");
		hm.put(105, "Devid");
		
		System.out.println("Students : ");
		
		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			System.out.println("Id : "+entry.getKey() +
								", Name : "+entry.getValue());
			
			
		}
		
	}
}
