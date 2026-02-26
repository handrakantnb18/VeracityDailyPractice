package com.methods;

public class SimpleThree {

	// 3) method within return type but no parameter
	
	
	int add()
	{
		return 10;
	}
	
	public static void main(String[] args) {
		
		SimpleThree s1 = new SimpleThree();
		
		int i = s1.add();
		System.out.println(i);
		
	}
}
