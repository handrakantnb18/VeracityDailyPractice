package com.java15featuresAll.features;

import java.util.Iterator;

public class PiramidPattern {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		
		for(int i = 1; i <= a; i++)
		{
			b = i - 1;
			
			for(int j = i; j <= a - 1; j++)
			{
				System.out.print(" ");
				
				System.out.print(" ");
			}
			
			for(int j = 0; j <= b; j++)
			
				System.out.print((i + j) < 10
				? (i + j)+ " "
						:(i + j)+" ");
				
				for(int j = 1; j <= b; j++)
				
					System.out.print((i + b - j) < 10
							? (i + b - j)+" "
									:(i + b - j)+" ");
					
				
				System.out.println();
			
		}
	}
}
