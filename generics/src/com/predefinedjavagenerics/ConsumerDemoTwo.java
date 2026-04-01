package com.predefinedjavagenerics;

import java.util.function.Consumer;

public class ConsumerDemoTwo {

	public static void main(String[] args) {
		
		Consumer<Student> c1 =(x)->
		{
				System.out.println(x);			
		};
		
		c1.accept(new Student(1, "Ram", 78.55));
	}
}
