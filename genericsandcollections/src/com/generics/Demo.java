package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("abc");
		list.add(123);
		String s = (String)list.get(0);
		Integer i = (Integer)list.get(1);
		
		System.out.println(s);
		System.out.println(i);
		
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(123);
		list1.add(456);
		list1.add(789);
		
		System.out.println(list1);
		
	}
}
