package com.corejava.mapList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConvertMaptoList {

	
	public static void main(String[] args) {
		
		List<Employee> names = Arrays.asList(
				new Employee(1, "OPPO", "Pune", "IT"),
				new Employee(2, "Samsung", "Mumbai", "Sales")
				);
		
		Map<Integer, Employee> map = 
				names.stream()
				.collect(Collectors.toMap(Employee::getId, name -> name));
		
		System.out.println(map);
		
	}
}
