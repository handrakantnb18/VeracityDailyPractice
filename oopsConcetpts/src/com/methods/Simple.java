package com.methods;

public class Simple {
	
	// 1) Method within no return type and no parameters
	
	void add()  // method
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		System.out.println("Addition is : " +num3);
	}
	
	void sub()
	{
		int num1 = 100;
		int num2 = 20;
		int num3 = num1 - num2;
		System.out.println("Substractio is : "+num3);
	}
	
	void mul()
	{
		int num1 = 10;
		int num2 = 2;
		int num3 = num1 * num2;
		System.out.println("Multiplication is : "+num3);
	}
	
	void div() 
	{
		int num1 = 10;
		int num2 = 5;
		int num3 = num1 / num2;
		System.out.println("Division is : "+num3);
	}
	public static void main(String[] args) {
		
		Simple s1 = new Simple();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
	}

}
