package com.demo.lambda;

import java.util.Arrays;

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
		
//		Test t = (x, y) ->
//		{
//			return x+y;
//		};
//		
//		int x = t.add(25, 25);
//		System.out.println(x);
		
//		Test t = (s1, s2) ->
//		{
//			return s1.equals(s2);
//		};
//		
//		System.out.println(t.getName("Chandra", "chandra")); // false -> check the values name are same or not (name convention )
		// compare two values - capital letters and small case
		
//		System.out.println(t.getName("Chandra", "Chandra")); // true -> check the values are equals or not
		
		
//		Test t = (int[]arr) ->
//		{
//			int sum = 0;
//			for(int x : arr)
//			{
////				if(x % 2 == 0)
////				{
////					System.out.println(x);
////				}
//				
//				sum = sum + x;
//			}
//			System.out.println("Sum : "+sum);
//			
//		};
//		
//		int numbers[] = {1,2,3,4,5};
//		
//		t.takeNumbers(numbers);
//		
		
//		Test t = (int[] x) ->
//		{
//			return x;
//		};
//		
////		int numbers[] = {1,2,3,4,5};
//		
//		int arr[] = t.getNumbers(new int[] {10,20,30,40,50}); // pro level used
//		
//		// toString method used
//		System.out.println(Arrays.toString(arr));
		
		
		Test t = () -> new String[] {"chandrakant", "Priyanka","Vijay", "anil", "sachin"};
		
		String str[] = t.getNames();
		
		System.out.println(Arrays.toString(str));
		
	}
}
