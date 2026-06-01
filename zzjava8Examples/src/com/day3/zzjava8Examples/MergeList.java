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
		
		System.out.println("Merged Employee : "+employee1);
		
		System.out.println("======================");
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(10);
		num1.add(50);
		num1.add(30);
		num1.add(70);
		num1.add(20);
		
		System.out.println("Without Merged : "+num1);
		
		List<Integer> num2 = new ArrayList<Integer>();
		num2.add(80);
		num2.add(40);
		num2.add(60);
		
		num1.addAll(num2);
		
		System.out.println("Merged Numbers : "+num2);
		
		
	}
}
