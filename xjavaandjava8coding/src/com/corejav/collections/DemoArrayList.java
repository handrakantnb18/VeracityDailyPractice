package com.corejav.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Chandrakant");
		list.add("Bhosale");
		list.add("Priyanka");
		list.add("Shivraj");
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		
	}
}
