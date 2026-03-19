package com.collection.linkedlist;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		// stack is legacy class
		// stack is synchronized class
		// stack is thread safe
		// LIFO - method is access
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(255);
		s.add(122);
		s.add(25);
		s.add(45);
		s.add(11);
		// s.add(null);
		// s.add(null);
		
//		System.out.println(s.peek()); // top element get

//		System.out.println(s.pop()); // top element remove
		
//		s.clear();
//		System.out.println(s.isEmpty());
		
		System.out.println(s.getFirst());
		
		System.out.println(s.getLast());
		
		// vector is a legacy class / old class
		// vector is synchronized class
		// vector is a thread safe
		
//		Vector<Integer> v = new Vector<Integer>();
//		v.add(255);
//		v.add(122);
//		v.add(25);
//		v.add(45);
//		v.add(11);
//		v.add(null);
//		v.add(null);
//		
//		System.out.println(v);
//		
		
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
