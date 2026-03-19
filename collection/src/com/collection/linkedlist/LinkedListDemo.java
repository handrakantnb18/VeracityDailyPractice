package com.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(255);
		list.add(122);
		list.add(25);
		list.add(45);
		list.add(11);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
	}
}
