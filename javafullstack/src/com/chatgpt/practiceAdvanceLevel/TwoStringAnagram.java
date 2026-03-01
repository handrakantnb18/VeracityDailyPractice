package com.chatgpt.practiceAdvanceLevel;

import java.util.Arrays;

public class TwoStringAnagram {

	public static void main(String[] args) {
		// Check If Two Strings are Anagrams
		
		String s1 = "Chandrakant";
		String s2 = "Bhosaleabcd";
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		System.out.println(Arrays.equals(a1, a2));
	}
}
