package com.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		// <type> -> generics are used for types safety
		
		
		// ArrayList
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		al.add(100);  
//		al.add(200);
//		al.add(450);
//		al.add(244);
//		al.add(350);
//		
//		System.out.println(al);
		
		// all types of data we can add
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(100);
		al.add("Chandr");
		al.add(true);
		al.add(55.45);
		al.add('A');
		
		System.out.println(al);
		
		
	}
}
