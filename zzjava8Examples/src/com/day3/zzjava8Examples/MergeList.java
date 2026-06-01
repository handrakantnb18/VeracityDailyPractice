package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		
		List<String> employee1 = new ArrayList<String>();
		employee1.add("Ram");
		employee1.add("Anil");
		employee1.add("Sachin");
		employee1.add("Prakash");
		employee1.add("Chandrakant");
		
		System.out.println("Without Merge : "+employee1);
		
		List<String> employee2 = new ArrayList<String>();
		employee2.add("Priyanka");
		employee2.add("Sivaraj");
		
		employee1.addAll(employee2);
		
		System.out.println(employee1);
		
		
	}
}
