package com.exception;

public class DemoTwo {

	// 1. exception nmae
	// 2. Exception msg
	// 3. Exception LineNo
	
	public static void main(String[] args) {
		
		String name = "Chandra";
		
		name = null;
		
		try
		{
			System.out.println(name.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println("Null value assign.");
			// System.out.println(n.getMessage());
			// System.out.println(n);
			n.printStackTrace();
		}
		
	}
}
