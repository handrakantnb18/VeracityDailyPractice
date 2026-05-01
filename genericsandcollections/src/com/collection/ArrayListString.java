package com.collection;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ram");
		list.add("Chandrakant");
		list.add("Priyanka");
		list.add("Keshav");
		list.add(null);
		list.add("Priyanka");

		
		System.out.println(list);
	}
}
