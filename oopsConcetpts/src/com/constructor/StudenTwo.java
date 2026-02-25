package com.constructor;

public class StudenTwo {

	
	// constructor types non-parameterized and parameterized contructor
	
	StudenTwo() {
		
		System.out.println("Non-parameterized constructor.");
	}
	
	StudenTwo(int a)
	{
		System.out.println("Parameterized constructor.");
	}
	
	
	public static void main(String[] args) {
		
		StudenTwo s1 = new StudenTwo(100);
		
	}
}
