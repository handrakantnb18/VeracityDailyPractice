package com.patterns;

public class NestedPattern3 {
	
	public static void main(String[] args) {
		
		// print * and print capital 'A' 5 times
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (i == 1 && j != 2 && j != 3 && j != 4)
				{
					System.out.print("A ");
				}
				else if (i == 3 && j != 1 && j != 2 && j != 4 && j != 5) 
				{
					System.out.print("A ");
				}
				else if (i == 5 && j != 2 && j != 3 && j != 4)
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
