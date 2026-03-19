package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		// vector is a legacy class / old class
		// vector is synchronized class
		// vector is a thread safe
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(255);
		v.add(122);
		v.add(25);
		v.add(45);
		v.add(11);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		
		
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		list.add(255);
//		list.add(122);
//		list.add(25);
//		list.add(45);
//		list.add(11);
//		list.add(null);
//		list.add(null);
//		
//		System.out.println(list);
	}
}
