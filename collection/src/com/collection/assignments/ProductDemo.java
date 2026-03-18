package com.collection.assignments;

import java.util.ArrayList;

public class ProductDemo {

	// product -- id, name, price, category, qty, discount
	
	public static void main(String[] args) {
		
		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product(1, "Samsung Galaxy", 10000, "Mobile", 10, 10));
		product.add(new Product(2, "Laptop", 89000, "Electronics", 15, 7));
		product.add(new Product(3, "iPhone 17", 150000, "Mobile", 5, 10));
		product.add(new Product(4, "OPPO", 15000, "Mobile", 10, 5));
		product.add(new Product(5, "HP", 75000, "Laptop", 9, 9));
		product.add(new Product(6, "Acer", 60000, "Laptop", 25, 11));
		product.add(new Product(7, "T-shirt", 900, "Fashon", 50, 3));
		product.add(new Product(8, "Chair Table", 8800, "Furniture", 30, 15));
		product.add(new Product(9, "Bata", 2500, "Shoes", 90, 5));
		product.add(new Product(10, "Head Phone", 1100, "Electronics", 60, 45));
		
		//double discount = 0;
		
		for(Product prod1 : product)
		{
			System.out.println("\n===============================");
			System.out.println("Id : "+prod1.getId());
			System.out.println("Name : "+prod1.getName());
			System.out.println("Price : "+prod1.getPrice());
			System.out.println("Category : "+prod1.getCategory());
			System.out.println("Quantity : "+prod1.getQty());
			System.out.println("Discount : "+prod1.getDiscount());
			
//			int existingSalary = emp3.getSalary();
			
//			emp3.setSalary(existingSalary + 50000);
		
			double price = prod1.getPrice();
			
			double discount = prod1.getDiscount();
			
			double finalPrice = price - (price * discount / 100);
			
			System.out.println("Final price : "+finalPrice);
		}
		
	}
}
