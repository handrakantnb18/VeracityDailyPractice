package com.methodreference;

public class Demo {

	void fun()
	{
		System.out.println("This is fun method.");
	}
	public static void main(String[] args) {
		
		Test t =()->
		{
			System.out.println("Add body");
		};
		
		t.add();
	}
}
