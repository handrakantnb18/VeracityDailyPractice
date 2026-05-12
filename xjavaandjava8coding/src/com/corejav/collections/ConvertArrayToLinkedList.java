package com.corejav.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayToLinkedList {

	public static void main(String[] args) {
		
		ArrayList<String> arra = new ArrayList<String>();
		
		arra.add("Chandrakant");
		arra.add("Bhosale");
		arra.add("Priyanka");
		arra.add("Shivraj");
		
		LinkedList<String> list = new LinkedList<String>(arra);	
		
		System.out.println(list);
		
		
	}
}
