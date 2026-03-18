package com.collection.assignments;

public class Books {

	private int id;

	private String name;

	private String author;

	private double price;

	private String category;

	
//	
//	@Override
//	public String toString() {
//		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", category="
//				+ category + "]";
//	}



	public Books(int id, String name, String author, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
