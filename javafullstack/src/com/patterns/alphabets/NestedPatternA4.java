package com.patterns.alphabets;
// 11/02/2026

public class NestedPatternA4 {
	
	public static void main(String[] args) {
		
		// print alphabets first ways A to Y == COLUMN and ROW
		
		
		for (char c = 65; c <= 89; c++)
		{
			for (int j = 65; j <= 89; j++)
			{
				
				System.out.print(c+ " ");
				
				c++;
			}
			System.out.println(" ");
		}
	}

}
