package com.methods;

public class DemoFour {

	
	// 4) method with return type and with parameter
	
	int add(int a, int b)
	{
		return a+ b;
	}
	
	String get(String name) 
	{
		return name.toUpperCase();
	}
	
	public static void main(String[] args) {
		DemoFour d4 = new DemoFour();
		
		int x = d4.add(100, 200);
		System.out.println(x);
		
		String n = d4.get("code with chandrakant");
		System.out.println(n);
	}
}
