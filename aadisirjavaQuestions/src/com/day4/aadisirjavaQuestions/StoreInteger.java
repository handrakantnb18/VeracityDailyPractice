package com.day4.aadisirjavaQuestions;

import java.util.PriorityQueue;

public class StoreInteger {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println("Priority Queue : "+pq);
		
		Integer prio = pq.remove();
		
		System.out.println("Remove Queue : "+prio);
		
		pq.add(25);
		
		System.out.println("After Queue : "+pq);
		
		// 2
		PriorityQueue<String> prq = new PriorityQueue<String>();
		
		prq.add("Shivraj");
		prq.add("Chandraaknt");
		prq.add("Priyanka");
		prq.add("Vijay");
		
		System.out.println("Add Elements : "+prq);
		
		String pr = prq.remove();
		
		System.out.println("Remove Elements : "+pr);
		
		prq.add("Shayam");
		
		System.out.println("Add elements : "+prq);
		
		
	}
}
