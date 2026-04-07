package com.streamAPI;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String gender;
	
	private double salary;
	
	private String city;

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", city=" + city
				+ "]";
	}

	
	public Employee(int id, String name, String gender, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.city = city;
	}
}
