package com.methods;

public class TestTwo {

	// 2 ) method with no return type and with parameter
	
	void add(int a) // parameter
	{
		System.out.println("With parameter : "+a);
		
	}
	
	void mul(int a, int b) // parameter
	{
		System.out.println("Multiplicatin is : "+(a * b));
	}
	
	void sub(int a, int b, int c)
	{
		System.out.println("Substraction : "+(a - b - c));
	}
	
	public static void main(String[] args) {
		
		TestTwo t1 = new TestTwo();
		
		t1.add(100);
		t1.mul(10, 200);
		t1.sub(500, 40, 80);
	}
}
