package com.corejav.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<String>();
		 
		 list.add("Chandrakant");
		 list.add("Bhosale");
		 list.add("Priyanka");
		 list.add("Shivraj");
		 list.add("DattaRaj");
		 
		 System.out.println(list);
		 
		 System.out.println(list.get(1));
		 
	}
}
