package com.collection;

public class Employee {

	private int id;
	
	private String name;
	
	private String address;
	
	private String salary;
	
	private String dep;
	
	private String gender;

	
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dep=" + dep
//				+ ", gender=" + gender + "]";
//	}



	public Employee(int id, String name, String address, String salary, String dep, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
