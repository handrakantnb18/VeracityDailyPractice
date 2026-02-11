package com.patterns;

public class NestedPattern4 {

	public static void main(String[] args) {
		
		// print * and change ROW and COLUMN $, 0, #
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (j == 1)
				{
					System.out.print("$ ");
				}
				else if (j == 3)
				{
					System.out.print("0 ");
				}
				else if (j == 5)
				{
					System.out.print("# ");
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
