package com.predefinedjavagenerics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemoTwo {

	public static void main(String[] args) {
		
//		Consumer<Student> c1 =(x)->
//		{
//				System.out.println(x);			
//		};
//		
//		c1.accept(new Student(1, "Ram", 78.55));
//		
		
		Consumer<List<Student>> c1 =(x)->
		{
			for(Student s:x)
			{
				System.out.println(s);
			}
		};
		
		c1.accept(Arrays.asList(
				new Student(1, "Ram", 78.55),
				new Student(2, "Chandraaknt", 89.55),
				new Student(3, "Priyanka", 85.66)));
		
		// Book
		// Product
		// Employee
		// List Book
		// List PRoduct
		// List Employee
		
		
	}
}
