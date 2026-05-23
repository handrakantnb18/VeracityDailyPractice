package com.day2.aadisirjavaQuestions;

import java.util.ArrayList;

public class AddRemoveElementsInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Banana");
		
		System.out.println("Add Frouts : "+list);
		
		
		list.remove(0);
		
		System.out.println("Removed Fruits : "+list);
		
		System.out.println("==================================");
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(14);
		list1.add(15);
		
		System.out.println("Add Number : "+list1);
		
		list1.remove(0);
		
		System.out.println("Removed Number : "+list1);
		
		
		
	}
}
