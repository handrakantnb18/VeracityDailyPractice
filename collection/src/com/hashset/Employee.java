package com.hashset;

public class Employee {

	private int empId;
	
	private String empName;
	
	private String dept;
	
	private double salary;
	
	private String addresss;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", salary=" + salary
				+ ", addresss=" + addresss + "]";
	}

	public Employee(int empId, String empName, String dept, double salary, String addresss) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
		this.addresss = addresss;
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

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}
	
	
	
}
