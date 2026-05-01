package com.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetInteger {

	public static void main(String[] args) {
		
		Set<Integer> list = new HashSet<Integer>();
		
		list.add(105);
		list.add(103);
		list.add(101);
		list.add(102);
		list.add(104);
		list.add(null);
		list.add(101);
		
		System.out.println(list);
		
	}
}
