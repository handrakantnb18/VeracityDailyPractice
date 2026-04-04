package com.methodreference;

public class Employee {

	private int id;
	
	private String name;
	
	private String gender;
	
	private double salary;
	
	private String address;

	public Employee(int id, String name, String gender, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
	
}
