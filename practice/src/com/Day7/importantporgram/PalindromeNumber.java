package com.Day7.importantporgram;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		String str = "madam";
        String rev = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
        	rev += str.charAt(i);
        }
        
        if(str.equals(rev))
        {
        	System.out.println("Paliondrom");
        }
        else
        {
        	System.out.println("Not paliondrom.");
        }
	}
}
