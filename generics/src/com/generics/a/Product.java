package com.generics.a;

public class Product {

private int id;
	
	private String name;
	
	private int price;
	
	private String address;

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", address=" + address + "]";
	}
	

	public Product(int id, String name, int price, String address) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.address = address;
	}
	

}
