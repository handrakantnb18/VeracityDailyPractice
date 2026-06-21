package com.java11featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {

	public static void main(String[] args) {
		
		 List<Employee> list = Arrays.asList(
		            new Employee(1,"Ram",50000),
		            new Employee(2,"Shyam",70000),
		            new Employee(3,"Amit",40000)
		        );

//		        list.stream()
//		            .sorted(Comparator.comparing(e -> e.salary))
//		            .forEach(System.out::println);
	}
}
