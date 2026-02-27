package com.linedin.coding;

public class PaliandromString {

	// Palindrome String (Ignoring Special Characters)
	// After converting uppercase letters to lowercase and removing all non-alphanumeric characters, check whether the string is a palindrome.
	// Input: s = "A man, a plan, a canal: Panama"
	// Processed String: amanaplanacanalpanama
	// Output: true

	public static boolean isPaliandrom(String s)
	{
		s = s.toLowerCase();
		
		s = s.replaceAll("[^a-z0-9]", "");
		
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right)
		{
			if (s.charAt(left) != s.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s= "A man, a plan, a canal: Panama";
		
		boolean re = isPaliandrom(s);
		System.out.println(re);
	}
}
