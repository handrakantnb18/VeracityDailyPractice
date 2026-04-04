package com.methodreference;

public class Demo {

	void fun()
	{
		System.out.println("This is fun method.");
	}
	public static void main(String[] args) {
		
//		Test t =()->
//		{
//			System.out.println("Add body");
//		};
//		
//		t.add();
		
		// Scope resolution operator
		
//		Demo d = new Demo();
//		
//		Test t = d::fun; // method reference
//		
		
		Test t = new Demo()::fun; // method reference
		
		t.add();
		
		
	}
}
