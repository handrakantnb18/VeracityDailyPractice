package com.aone;

public class PaliandromString {

	public static void main(String[] args) {
		
//		String str = "madam";
		
		String str = "seen";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("Paliandrom");
		}
		else {
			System.out.println("Not paliandrom");
		}
		
		
		int num = 121;
		
		int temp = num;
		
		int rev1 = 0;
		
		while(temp != 0)
		{
			int digit = temp % 10;
			rev1 = rev1 * 10 + digit;
			temp = temp / 10;
		}
		
		if(num == rev1)
		{
			System.out.println("Paliondrom Number");
		}
		else
		{
			System.out.println("Not paliondrom number");
		}
	}
}
