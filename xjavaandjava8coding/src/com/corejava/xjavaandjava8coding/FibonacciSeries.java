package com.corejava.xjavaandjava8coding;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a = 0, b = 1;
		
		for(int i =1; i <=10; i++)
		{
			System.out.println(a + " ");
			
			int c = a+ b;
				
				a = b;
				b = c;
		}
		
		int x = 0, y = 1;
		
		for(int j = 1; j <= 20; j++)
		{
			System.out.println(x + " ");
			
			int z = x + y;
			
				x = y;
				y = z;
				
		}
	}
}
