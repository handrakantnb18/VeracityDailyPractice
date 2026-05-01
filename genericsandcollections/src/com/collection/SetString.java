package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetString {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Ram");
		set.add("Chandrakant");
		set.add("Priyanka");
		set.add("Vijay");
		set.add("Keshav");
		set.add("Ram");
		
		System.out.println(set);
		
	}
}
