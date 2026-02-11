package com.patterns;
// 11/02/2026
public class NestedPattern1 {
	
	public static void main(String[] args) {
		
		// print star and all middle  capital 'A'
		
		for(int i = 1; i <= 5; i++) 
		{
			for(int j = 1; j<= 5 ; j++)
			{
				if (i == 3 && j != 1 && j != 2 && j != 4 && j != 5)
				{
					System.out.print("A ");
				}
				else 
				{
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

}
