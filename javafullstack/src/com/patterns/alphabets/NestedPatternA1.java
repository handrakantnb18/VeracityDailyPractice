package com.patterns.alphabets;

public class NestedPatternA1 {

	public static void main(String[] args) {
		
		// print alphabets first ways i == ROW
		
		for (int i = 65; i <= 69; i++)
		{
			for (int j = 65; j <= 69; j++)
			{
				System.out.print((char)i+ " ");
			}
			System.out.println();
		}
		
	}
}
