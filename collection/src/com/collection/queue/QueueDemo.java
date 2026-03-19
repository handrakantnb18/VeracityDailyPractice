package com.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Deque<Integer> d = new ArrayDeque<Integer>();
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		pq.add(255);
//		pq.add(333);
//		pq.add(88);
//		pq.add(456);
//		pq.add(123);
//		// pq.add(null);
//		pq.add(123);
//		
//		System.out.println(pq);
//		
		
		
		ArrayDeque<Integer> pq = new ArrayDeque<Integer>();
		pq.add(255);
		pq.add(333);
		pq.add(88);
		pq.add(456);
		pq.add(123);
		// pq.add(null)
		pq.add(255);
		pq.add(123);
		pq.add(-11);
		
//		System.out.println(pq.peekFirst()); // get first
		
//		System.out.println(pq.peekLast()); // get last
		
//		System.out.println(pq.peek()); // get
		
//		System.out.println(pq);
		
		System.out.println(pq.pop()); // delete 
		
		System.out.println(pq.pollFirst()); // delete first
		
		System.out.println(pq.pollLast()); // delete last
		
		
	}
}
