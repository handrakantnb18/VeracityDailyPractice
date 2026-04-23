package com.Day4.practice.java8;

public class Employee {

	private int id;
	
	private String name;
	
	private String city;
	
	private String dept;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", dept=" + dept + "]";
	}

	public Employee(int id, String name, String city, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.dept = dept;
	}
	
	
}
