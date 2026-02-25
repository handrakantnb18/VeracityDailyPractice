package com.methods;

public class Demo2 {

	// 2) method  with no return type and with parameter
	
	
	void add(int a, int b) // parameter
	{
		int c= a + b;
		System.out.println("Addition is : "+c);
	}
	
	void sub(int a, int b) // parameter
	{
		int c= a - b;
		System.out.println("Addition is : "+c);
	}
	
	void div(int a, int b) // parameter
	{
		int c= a / b;
		System.out.println("Addition is : "+c);
	}
	
	void mul(int a, int b) // parameter
	{
		int c= a * b;
		System.out.println("Addition is : "+c);
	}
	
	public static void main(String[] args) {
		Demo2 d2 = new Demo2();
		
		d2.add(10, 20);
		d2.mul(10, 20);
		d2.div(100, 20);
		d2.sub(100, 20);
	}
}
