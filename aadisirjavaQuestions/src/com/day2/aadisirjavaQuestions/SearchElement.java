package com.day2.aadisirjavaQuestions;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		
		String searchElement = "Banana";
		
		if(list.contains(searchElement))
		{
			System.out.println(searchElement+" Is found");
		}
		else
		{
			System.out.println(searchElement+"Is not found");
		}

	}
}
