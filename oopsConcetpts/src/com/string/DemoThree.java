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
		
		String s1 = new String("abc");
		
		String s2 = new String("abc");
		
		System.out.println(s1.equals(s2));
		
	}
}
