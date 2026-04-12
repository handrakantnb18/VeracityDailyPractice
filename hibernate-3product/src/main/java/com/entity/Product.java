package com.entity;

public class Product {

	private int id;
	
	private String pname;
	
	private int price;
	
	private String city;

	// constructor
	public Product(int id, String pname, int price, String city) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
		this.city = city;
	}

	// toString
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", price=" + price + ", city=" + city + "]";
	}

	// getter and setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
