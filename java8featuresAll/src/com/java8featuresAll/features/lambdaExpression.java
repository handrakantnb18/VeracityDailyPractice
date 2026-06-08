package com.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class lambdaExpression {

	// Lambda expression they allow you to express instance of
	// single method interface its functional interface
	
	public static void main(String[] args) {
	
		List<String> student = Arrays.asList(
				"Subhash", "Chandrakant","Vijay","Prithvi", "Vishu", "Dyana"
				);
		
		student.forEach(students -> System.out.println(students));
		
		List<Integer> list = Arrays.asList(1,5,6,2,3,5,7,8,89,9);
		
		list.forEach(lt -> System.out.println(lt));
		
		
		
		
		
	}
}
