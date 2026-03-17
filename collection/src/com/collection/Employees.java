package com.collection;

public class Employees {

	private int id;
	
    private String name;
	
	private String address;
	
	private int salary;
	
	private String dep;
	
	private String gender;

	
	
	
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", dep=" + dep
				+ ", gender=" + gender + "]";
	}

	
	public Employees(int id, String name, String address, int salary, String dep, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
	}

	public int getId()
	{
		return id;
	}
	
	public void seId(int id)
	{
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
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
