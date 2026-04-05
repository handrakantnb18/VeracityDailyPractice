package com.codingInterviewQuestions;


interface Test
{
	int show(int a, int b);
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		Test t = (a, b) -> a + b;
		
		System.out.println(t.show(100, 20));
		
		Show t2 = (x, y) -> x- y;
		
		System.out.println(t2.add(50, 88));
	}
}

interface Show
{
	int add(int x, int y);
}
