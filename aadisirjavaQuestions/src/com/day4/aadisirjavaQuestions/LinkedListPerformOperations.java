package com.day4.aadisirjavaQuestions;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformOperations {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("cadbary");
		
		System.out.println(list);
		
		list.addFirst("Strobery");
		
		list.addLast("Zing");
		
		System.out.println("Added last and first : "+list);
		
		
		
	}
}
