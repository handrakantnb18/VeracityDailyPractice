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
		
		
		
	}
}
