package com.methodreference;

public class Demo {

	void fun()
	{
		System.out.println("This is fun method.");
	}
	
	void display()
	{
		int a = 100, b = 20;
		System.out.println("Addition       : "+(a+b));
		System.out.println("Substraction   : "+(a-b));
		System.out.println("Division       : "+(a/b));
		System.out.println("Multiplication : "+(a*b));
	}
	public static void main(String[] args) {
		
//		Test t =()->
//		{
//			System.out.println("Add body");
//		};
//		
//		t.add();
		
		// Scope resolution operator ::
		
//		Demo d = new Demo();
//		
//		Test t = d::fun; // method reference
//		
		
//		Test t = new Demo()::fun; // method reference
//		
//		t.add();
		
		Test t = new Demo()::display;
		
		t.add();
	}
}
