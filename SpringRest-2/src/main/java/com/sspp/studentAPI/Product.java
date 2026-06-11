package com.sspp.studentAPI;

public class Product {

	private int pd;
	
	private String pname;
	
	private double price;

	@Override
	public String toString() {
		return "Product [pd=" + pd + ", pname=" + pname + ", price=" + price + "]";
	}

	public Product(int pd, String pname, double price) {
		super();
		this.pd = pd;
		this.pname = pname;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPd() {
		return pd;
	}

	public void setPd(int pd) {
		this.pd = pd;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
