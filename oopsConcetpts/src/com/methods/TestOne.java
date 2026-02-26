package com.methods;

public class TestOne {

	
	// 1) method with no return type and no parameter
	
	void add()
	{
		int a = 10;
		int b= 20;
		int c = a + b;
		System.out.println("Addition is :"+c);
		
	}
	
	void mul()
	{
		int a = 100;
		int b = 10;
		System.out.println("Multiplication is : "+(a * b));
	}
	
	void div()
	{
		int a = 100;
		int b= 20;
		int c = a / b;
		System.out.println("Division is : "+c);
	}
	
	void sub()
	{
		int a = 500;
		int b = 100;
		System.out.println("Substraction is "+(a - b));
	}
	
	public static void main(String[] args) {
		TestOne s1 = new TestOne();
		s1.add();
		s1.mul();
		s1.sub();
		s1.div();
	}
}
