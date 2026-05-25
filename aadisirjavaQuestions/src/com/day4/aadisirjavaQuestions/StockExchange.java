package com.day4.aadisirjavaQuestions;

import java.util.Stack;

public class StockExchange {

	public static void main(String[] args) {
		
		Stack<String> list = new Stack<String>();
		
		list.add("Appale");
		list.add("Banana");
		list.add("Mango");
				
		System.out.println("All list : "+list);
		
		System.out.println("Add elements : "+list.push("Chandrakant"));
		
		System.out.println("Remove elements : "+list.pop());
		
		System.out.println("List of elements : "+list);
		
	}
}
