package com.codingInterviewFour;

public class Student {

	private int id;
	
	private String name;
	
	private int salary;
	
	private String city;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	public Student(int id, String name, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
