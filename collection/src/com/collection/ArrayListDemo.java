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
		
//		ArrayList<Object> al = new ArrayList<Object>();
//		al.add(100);
//		al.add("Chandr");
//		al.add(true);
//		al.add(55.45);
//		al.add('A');
//		
//		System.out.println(al);
		
		// String datatype only added
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Chandra");
//		al.add("Priyanka");
//		al.add("Vijay");
//		al.add("ram");
//		
//		System.out.println(al);
//		
		// float data type addded
		
		ArrayList<Float> al = new ArrayList<Float>();
		al.add(45.45f);
		al.add(55.54f);
		al.add(99.89f);
		al.add(4.5f);
		
		System.out.println(al);
		
		
		
	}
}
