package com.methodreference;

public class Demo {
	
	
//	void fun(int a)
//	{
//		System.out.println("Fun add : "+a);
//	}
	
	// constructor 
	
	public Demo(String a, int b) {
		System.out.println("Constructor method used : "+(a+b));
		// TODO Auto-generated constructor stub
	}
	
	// instance method
	
//	void fun(int a)
//	{
//		System.out.println("Fun add : "+a);
//	}

	// Static method
	
//	static void fun(int a)
//	{
//		System.out.println("Fun add : "+a);
//	}
	
//	public Demo() {
//		System.out.println("Default constructor");
//		// TODO Auto-generated constructor stub
//	}
//	void fun()
//	{
//		System.out.println("This is fun method.");
//	}
//	
//	void display()
//	{
//		int a = 100, b = 20;
//		System.out.println("Addition       : "+(a+b));
//		System.out.println("Substraction   : "+(a-b));
//		System.out.println("Division       : "+(a/b));
//		System.out.println("Multiplication : "+(a*b));
//	}
//	
//	static void m1()
//	{
//		System.out.println("Static method reference used");
//	}
	
	
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
		
		// instance method reference
//		Test t = new Demo()::display;
//		
//		t.add();
		
		// static method reference
//		Test t = Demo::m1;
//		
//		t.add();
		
		
//		Test t = Demo:: new;
//		
//		t.add();
		
//		Test t =new Demo()::fun;
//		
//		t.add(34);
		
		// static method
//		Test t =Demo::fun;
//		
//		t.add(34);
		
		// string variable
		
		Test t= Demo::new;
		
		t.add("Chandraaknt ", 1818);
	}
}
