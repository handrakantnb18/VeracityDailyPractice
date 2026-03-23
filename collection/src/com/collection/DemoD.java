package com.collection;

import java.util.ArrayList;

public class DemoD {


	public static void main(String[] args) {
		
		
		// <type> -> generics are used for types safety
		
		
		// ArrayList
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		al.add(100);  
//		al.add(200);
//		al.add(450);
//		al.add(244);
//		al.add(350);
//		al.add(900);
//		al.add(900);
//		al.add(600);
//		al.add(null);
//		al.add(null); // null value taken any number of time
//		
//		System.out.println(al.get(1)); // indexing format
//		
		// all types of data we can add
		
//		ArrayList<Object> al = new ArrayList<Object>();
//		al.add(100);
//		al.add("Chandr");
//		al.add(true);
//		al.add(55.45);
//		al.add('A');
//		
//		System.out.println(al);
		
		// String datatype only added
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chandra");
		al.add("Priyanka");
		al.add("Vijay");
		al.add("ram");
		al.add("sachin");
		
		
//		System.out.println(al);
		
		// 1) for loop
		
//		for(int i = 0; i < al.size(); i++)
//		{
//			System.out.println(al.get(i));
//		}
		
		// 2) forEach loop
		
//		for(String s:al)
//		{
//			System.out.println(s);
//		}
		
		// 3) iterator() method
		// we can use in hole collection 1. list, 2. set, 3. queue
		// iterator can iterator element in forward direction
		
//		while (al.iterator().hasNext())
//		{
//			System.out.println(al.iterator().next());
//		}
		
//		Iterator<String> itr = al.iterator();
//		
//		while (itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		// 4) List iterator
		// we can use only list
		// we can iterator list both direction
		
//		ListIterator<String> ltr = al.listIterator();
//		
//		while(ltr.hasNext())
//		{
//			System.out.println(ltr.next());
//		}
//		
//		System.out.println("===========");
//		while(ltr.hasPrevious())
//		{
//			System.out.println(ltr.previous());
//		}
		
		for(String s: al)
		{
			System.out.println(s);
		}
		
		
//		ArrayList<String> al2 = new ArrayList<String>();
//		al2.add("adi");
//		al2.add("Prakash");
//		al2.add("shyam");
//		al2.add("kishor");
//		
//		al.addAll(al2);
//		
//		System.out.println(al);
//		System.out.println(al.size());
//		
//		System.out.println(al.contains("ram"));
//		
		
//		System.out.println(al.size()); // size checked
//		System.out.println(al.get(1));
//		System.out.println(al.set(1, "ravi"));
		
//		System.out.println(al.remove(1));
//		System.out.println(al.remove("ram"));
		
//		System.out.println(al);
//		al.clear();
//		System.out.println(al);
//		System.out.println(al.isEmpty());
//		System.out.println(al.contains("ram"));
		
//		System.out.println(al.indexOf("rama")); // if not available the  -1
//		System.out.println(al.reversed());
		
//		System.out.println(al.getFirst());
//		System.out.println(al.getLast());
		
		
		// float data type addded
		
//		ArrayList<Float> al = new ArrayList<Float>();
//		al.add(45.45f);
//		al.add(55.54f);
//		al.add(99.89f);
//		al.add(4.5f);
//		
//		System.out.println(al);
//		
		// Charactor data added only
		
//		ArrayList<Character> al = new ArrayList<Character>();
//		al.add('A');
//		al.add('B');
//		al.add('C');
//		al.add('D');
//		
//		System.out.println(al);
//		
	}

}
