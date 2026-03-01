package com.chatgpt.practice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// Swap Tow Numbers Without Third Variable
		
		int a = 5, b = 10;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Number Swapped : ");
		System.out.println("a = "+ a +", b = "+b);
	}
}
