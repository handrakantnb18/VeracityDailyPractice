package com.string;

public class DemoThree {

	public static void main(String[] args) {
		
		// == it will check the memory address of both String
		
//		String s1 = "Chandrakant";
//		
//		String s2 = "Chandrakant";
//		
//		System.out.println(s1 == s2);
		
		
		// it will check the contend of both String
		
//		String s1 = new String("abc");
//		
//		String s2 = new String("abc");
//		
//		System.out.println(s1.equals(s2));
		
		
//		String s1 ="chandrakant"; // scp memory
		
//		String s2 = new String("chandrakant"); // heap memory
		
//		System.out.println(s1 == s2); // false
		
//		System.out.println(s1.equals(s2)); // true
		
		// == check the memory
		// .equals check the content / value
		
		
		String s1 = "Chandraaknt";
		
		System.out.println(s1.length());
		
		System.out.println(s1.indexOf('a')); // first index
		
		System.out.println(s1.lastIndexOf('t'));  // last index
		
		System.out.println();
	}
}
