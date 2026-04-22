package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		
		List<EmployeesMap> list = Arrays.asList(
				new EmployeesMap(1, "Chandrakant", "pune"),
				new EmployeesMap(2, "Priyanka", "Pune"),
				new EmployeesMap(3, "Vijay", "Mumbai")
				);
		
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(
						EmployeesMap::getId, 
						EmployeesMap::getName
						
						));
		
		System.out.println(map);
		
		System.out.println("===============================================");
		
		List<EmployeesMap> list1 = Arrays.asList(
				new EmployeesMap(1, "Ram", "Banglore"),
				new EmployeesMap(2, "Subhash", "Pune"),
				new EmployeesMap(3, "Sachin", "Chennai")
				);
		
		Map<Integer, String> map1 = list1.stream()
				.collect(Collectors.toMap(
						EmployeesMap::getId,
						EmployeesMap::getName
						));
		
		System.out.println(map1);
				
	}
}
