package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetString {

	public static void main(String[] args) {
		
		Set<String> list = new HashSet<String>();
		
		list.add("Ram");
		list.add("Chandraaknt");
		list.add("Priyanka");
		list.add("Keshav");
		list.add(null);
		list.add("Keshav");

		System.out.println(list);
		
	}
}
