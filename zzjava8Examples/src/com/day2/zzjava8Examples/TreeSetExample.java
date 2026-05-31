package com.day2.zzjava8Examples;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Anil");
		ts.add("Pranil");
		ts.add("mahesh");
		ts.add("Rahul");
		ts.add("Ram");
		
		System.out.println("Employee : "+ts);
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(50);
		ts1.add(90);
		ts1.add(30);
		ts1.add(70);
		ts1.add(60);
		
		System.out.println("Numbers : "+ts1);
		
	}
}
