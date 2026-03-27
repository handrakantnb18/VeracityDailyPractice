package com.entity;

public class Employee {

	private int id;
	
	private String name;
	
	private String gender;
	
	private String city;
	
	private double salary;

	private String dept;
	
	
	
	public Employee(int id, String name, String gender, String city, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.salary = salary;
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
