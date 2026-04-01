package com.generics.a;

public class Employee {

private int id;
	
	private String name;
	
	private String dept;
	
	private String address;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

	public Employee(int id, String name, String dept, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	

}
