package com.collection;

import java.util.LinkedList;

public class LinkedListList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(45);
		list.add(46);
		list.add(51);
		list.add(48);
		list.add(49);
		list.add(50);
		list.add(51);
		list.add(null);
		
		System.out.println(list);
		
	}
}
