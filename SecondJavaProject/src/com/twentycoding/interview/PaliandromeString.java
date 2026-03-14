package com.twentycoding.interview;

public class PaliandromeString {

	public static void main(String[] args) {
		
		String str = "RAR";
        String rev = "";

        for(int i = str.length()-1; i >=0; i--) {
            rev += str.charAt(i);
        }

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        
	}
}
