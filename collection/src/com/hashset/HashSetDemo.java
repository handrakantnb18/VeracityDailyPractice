package com.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		// 5 student
		
		// 5 books
		
		// 5 Employees
		
		// 5 Users
		
		// clear, size, isEmpty, contains, iterator, remove, reverse, 
		// ArrayList all methods are present expect get, set, indexOf, lastIndexOf
		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		hs.add(255);
//		hs.add(333);
//		hs.add(88);
//		hs.add(456);
//		hs.add(123);
//		hs.add(null);
//		hs.add(123);
//		
//		System.out.println(hs);
//		
		// < type > - generic type 
		// linkedHashSet
		
		// 5 student
		
		// 5 books
				
		// 5 Employees
				
		// 5 Users
				
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		lhs.add(255);
//		lhs.add(333);
//		lhs.add(88);
//		lhs.add(456);
//		lhs.add(123);
//		lhs.add(null);
//		lhs.add(123);
//		
//		System.out.println(lhs);
//		
		
		// TreeSet
		
		// 5 student
		
		// 5 books
						
		// 5 Employees
						
		// 5 Users
				
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(255);
		ts.add(333);
		ts.add(88);
		ts.add(456);
		ts.add(123);
		// ts.add(null);
		ts.add(123);
		
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("Chandr");
		ts2.add("Ajay");
		ts2.add("Subhash");
		ts2.add("Ram");
		ts2.add("Balu");
		// ts.add(null);
		ts2.add("Priyanka");
		
		System.out.println(ts2);
		
		System.out.println(ts);
		
	}
}
