package com.linedin.coding;

public class ReverseStringCharacterArray {

	public static void main(String[] args) {
		// different ways to reverse a string in Java Using Character Array
		
		String str = "Bhosale Chandrakant";
		char[] arr = str.toCharArray();
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end)
		{
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reverse String : "+ new String(arr));
	}
}
