package com.methods;

public class SimpleFour {

	// 4) method with return type and with parameter
	
	int add(int a, int b) // parameters
	{
		
		return a + b; // return type
		// System.out.println("Methoid with return type and with parameter");
	}
	
	int mul(int a, int b)
	{
		return a* b;
	}
	
	int div(int a , int b)
	{
		return a / b;
	}
	
	int sub(int a, int b)
	{
		return a - b;
	}
	
	public static void main(String[] args) {
		
		SimpleFour s1 = new SimpleFour();
		
		int a = s1.add(10, 20);
		System.out.println("Addition is :"+a);
		
		int b = s1.mul(100, 20);
		System.out.println("Multiplication is : "+b);
		
		int c = s1.div(400, 50);
		System.out.println("Division is : "+c);
		
		int d = s1.sub(500, 100);
		System.out.println("Substraction is : "+d);
		
	}
}
