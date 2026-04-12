package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	
	private String empname;
	
	private double salary;
	
	private String dept;
	
	private String email;

	public int getId() {
		return id;
	}

	//toString method
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", salary=" + salary + ", dept=" + dept + ", email="
				+ email + "]";
	}

	// Constructor
	public Employee(int id, String empname, double salary, String dept, String email) {
		super();
		this.id = id;
		this.empname = empname;
		this.salary = salary;
		this.dept = dept;
		this.email = email;
	}

	// getter and setter method
	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
