package com.hashset;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// 5 student
		
		// 5 books
		
		// 5 Employees
		
		// 5 Users
		
		// clear, size, isEmpty, contains, iterator, remove, reverse, 
		// ArrayList all methods are present expect get, set, indexOf, lastIndexOf
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(255);
		hs.add(333);
		hs.add(88);
		hs.add(456);
		hs.add(123);
		hs.add(null);
		hs.add(123);
		
		System.out.println(hs);
		
	}
}
