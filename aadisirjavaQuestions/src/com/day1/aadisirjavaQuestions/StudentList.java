package com.day1.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentList {

	public static void main(String[] args) {

		Map<Integer, List<Student>> map = new HashMap<Integer, List<Student>>();

		List<Student> list = Arrays.asList(
				new Student(1, "Ram", "Pune"), 
				new Student(2, "Chandrakant", "Pune")
				);
		
		map.put(1, list);
		map.put(2, list);
		map.put(3, list);
		
		
		System.out.println(map);

		
	}
}
