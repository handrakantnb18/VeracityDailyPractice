package com.book;

public class Book {

	// Boo- id, name, price, auther, qty, mfgdate, expand
	
	private int id;
	
	private String name;
	
	private int price;
	
	private String auther;
	
	private int qty;
	
	private String mfgdate;
	
	private String expand;

	// toString
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", auther=" + auther + ", qty=" + qty
				+ ", mfgdate=" + mfgdate + ", expand=" + expand + "]";
	}

	// constructor
	
	public Book(int id, String name, int price, String auther, int qty, String mfgdate, String expand) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.auther = auther;
		this.qty = qty;
		this.mfgdate = mfgdate;
		this.expand = expand;
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

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(String mfgdate) {
		this.mfgdate = mfgdate;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}	
	
}
