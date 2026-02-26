package com.methods;

public class TestFour {

	
	// 4) method with return type and with parameter
	
	int add(int a, int b) // parameter
	{
		return a + b;
	}
	
	int sub(int a, int b)
	{
		return a - b;
	}
	
	int div(int x, int y)
	{
		return x / y;
	}
	String set(String a1, String a2)
	{
		return "Priya";
		
	}
	
	public static void main(String[] args) {
		
		TestFour t1 = new TestFour();
		int i =t1.add(10, 20);
		System.out.println("Additin is : "+i);
		
		int j = t1.sub(40, 20);
		System.out.println("Substraction is : "+j);
		
		String re = t1.set("Pune", "Mumbai");
		System.out.println(re);
	}
}
