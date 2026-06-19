package com.java10featuresAll.features;

public class Product {

	private Integer id;
	
	private String name;
	
	private Integer price;
	
	private String city;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", city=" + city + "]";
	}

	public Product(Integer id, String name, Integer price, String city) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.city = city;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
