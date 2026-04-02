package com.generics.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeListConsumer {

	public static void main(String[] args) {
		
//		Consumer<EmployeeConsumer> c1 = (x) ->
//		{
//			System.out.println(x);
//		};
//		
//		c1.accept(new EmployeeConsumer(1, "Chandrakant", "IT", "Pune"));
		
		Consumer<List<EmployeeConsumer>> b2 = (y)->
		{
			for(EmployeeConsumer ec: y)
			{
				System.out.println(ec);
			}
		};
		
		b2.accept(Arrays.asList(
				new EmployeeConsumer(1, "Priyanka", "IT", "Pune"),
				new EmployeeConsumer(2, "Vijay", "Transport", "Mumbai"),
				new EmployeeConsumer(3, "Ram", "Sales", "Pune")));
		
	}
}
