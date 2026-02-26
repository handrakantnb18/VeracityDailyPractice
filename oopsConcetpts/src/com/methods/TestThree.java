package com.methods;

public class TestThree {

	// 3) method with return type but no parameter
	
	int add() // no - parameter
	{
		System.out.println("No parameter but return type used");
		return 100; // return type
		// return 200;
		// System.err.println();
	}
	
	public static void main(String[] args) {
		
		TestThree t1 = new TestThree();
		int i = t1.add();
		System.out.println(i);
		
		
	}
}
