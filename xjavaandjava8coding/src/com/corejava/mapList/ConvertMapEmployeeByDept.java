package com.corejava.mapList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapEmployeeByDept {

	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(1, "Java","pune", "IT"),
				new Employee(2, "HTML", "pune", "sales"),
				new Employee(3, "CSS", "Mumbai", "trans")
				);
		
		
		Map<String, List<Employee>> map =
		        list.stream()
		                 .collect(Collectors.groupingBy(Employee::getDept));
		
		System.out.println(map);

	}
}
