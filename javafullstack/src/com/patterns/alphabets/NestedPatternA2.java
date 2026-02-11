package com.patterns.alphabets;

public class NestedPatternA2 {
	
	public static void main(String[] args) {
		
		// print alphabets first ways C == COLUMN
		
		for (int i = 1; i <= 5; i++)
		{
			for (char c = 65; c <= 69; c++)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}

}
