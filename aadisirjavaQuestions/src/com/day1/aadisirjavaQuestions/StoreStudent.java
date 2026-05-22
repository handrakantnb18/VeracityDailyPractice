package com.day1.aadisirjavaQuestions;

import java.util.ArrayList;
import java.util.List;

public class StoreStudent {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		
		System.out.println(list);
		
		// String
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Chandraaknt");
		list1.add("Priyanka");
		list1.add("Shivraj");
		list1.add("Bhosale");
		
		System.out.println(list1);
		
		list1.remove(0);
		
		System.out.println(list1);
		
		
		
	}
}
