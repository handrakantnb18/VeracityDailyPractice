package com.collection.assignments;

public class Employee {

	private int empId;
	
	private String empName;
	
	private String dept;
	
	private double salary;
	
	private String city;
	
	private String mobile;

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary + ", city="
				+ city + ", mobile=" + mobile + "]";
	}

	
	
	public Employee(int empId, String empName, String dept, double salary, String city, String mobile) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
		this.city = city;
		this.mobile = mobile;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
