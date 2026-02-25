package com.methods;

public class Demo {

	// 1) method  with no return type and no parameter
	void add()
	{
		int a = 10;
		int b = 20;
		int c= a + b;
		System.out.println("Addition : "+c);
	}
	
	void sub()
	{
		int a = 100;
		int b = 20;
		int c = a - b;
		System.out.println("Substraction : "+c);
	}
	
	void div()
	{
		int a = 10;
		int b = 2;
		int c= a / b;
		
		System.out.println("Division : "+c);
	}
	
	void mul()
	{
		int a = 100;
		int b = 20;
		int c = a * b;
		
		System.out.println("Multiplication : "+c);
	}
	
	
	void login()
	{
		System.out.println("Login method.");
	}
	
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		demo.add();
		demo.sub();
		demo.div();
		demo.mul();
		
		demo.login();
	}
}
