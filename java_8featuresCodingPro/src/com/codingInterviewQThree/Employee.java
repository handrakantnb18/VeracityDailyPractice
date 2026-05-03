package com.codingInterviewQThree;

public class Employee {

	private int id;
	
	private String empname;
	
	private int salary;
	
	private String city;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", salary=" + salary + ", city=" + city + "]";
	}

	public Employee(int id, String empname, int salary, String city) {
		super();
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
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
