package com.generics.assignments;

public class EmployeeConsumer {

	private int id;
	
	private String name;
	
	private String dept;
	
	private String address;

	// toString method
	@Override
	public String toString() {
		return "EmployeeConsumer [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

	// Constructor
	public EmployeeConsumer(int id, String name, String dept, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	// getter and Setter language
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
