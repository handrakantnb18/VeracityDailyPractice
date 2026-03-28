package com.demo.lambda;

public class Demo {

	public static void main(String[] args) {
		
//		Test t = () ->
//		{
//			System.out.println("Add ");
//		};
		
//		Test t = () -> System.out.println("Add");
		
//		t.add();
		
//		Test t =(int a, int b) ->
//		{
//			System.out.println(a+b);
//		};
//		
//		t.add(12, 20);
		
//		Test t = (a, b) -> System.out.println(a+b);
//		
//		t.add(25, 20);
		
		Test t = (x, y) ->
		{
			return x+y;
		};
		
		int x = t.add(25, 25);
		System.out.println(x);
		
	}
}
