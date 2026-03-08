package com.exception;

public class DemoThrows {

	void fun() throws ArithmeticException, NegativeArraySizeException, Exception
	{
		
		// yes or NO : throws
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		DemoThrows d = new DemoThrows();
		try
		{
//			d.fun();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
