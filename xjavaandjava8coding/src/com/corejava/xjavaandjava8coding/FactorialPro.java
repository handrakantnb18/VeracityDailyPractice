package com.corejava.xjavaandjava8coding;

public class FactorialPro {

	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		
		for(int i =1; i<num; i++)
		{
			fact *= i;
		}
		
		System.out.println(fact);
		
		
		int num1 = 9;
		int fact1 = 1;
		
		for(int j = 1; j<num1; j++)
		{
			fact1 *= j;
		}
		
		System.out.println(fact1);
		
		
	}
}
