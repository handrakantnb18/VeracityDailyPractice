package com.codingInterviewFour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortStudent {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.stream()
	    .sorted(Comparator.comparing(Student::getSalary))
	    .forEach(System.out::println);
		
	}
}
