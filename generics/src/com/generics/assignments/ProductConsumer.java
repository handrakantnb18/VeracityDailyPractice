package com.generics.assignments;

public class ProductConsumer {

	private int id;
	
	private String name;
	
	private int price;
	
	private String address;

	// toString method
	@Override
	public String toString() {
		return "ProductConsumer [id=" + id + ", name=" + name + ", price=" + price + ", address=" + address + "]";
	}

	// Constructor
	public ProductConsumer(int id, String name, int price, String address) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
	}

	// getter and setter method
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
