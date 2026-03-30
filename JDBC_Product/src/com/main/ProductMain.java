package com.main;

import com.controller.ProductController;
import com.product.Product;

public class ProductMain {


	// 3. Product -- id, name, price, catagory, qty
	// insert, update, delete, get, getAll
	
	
	public static void main(String[] args) {
		
		ProductController controller = new ProductController();
		
		// insert product in table
		
//		try
//		{
//			Product p1 = new Product(1, "Samsung", 250000, "Mobile", 10);
//			Product p2 = new Product(2, "Laptop", 65000, "Electronics", 5);
//			Product p3 = new Product(3, "Mobile Phone", 25000, "Electronics", 12);
//			Product p4 = new Product(4, "Headphones", 2000, "Accessories", 20);
//			Product p5 = new Product(5, "Keyboard", 1200, "Computer Accessories", 18);
//			Product p6 = new Product(6, "Mouse", 800, "Computer Accessories", 25);
//			Product p7 = new Product(7, "Office Chair", 7000, "Furniture", 6);
//			Product p8 = new Product(8, "Study Table", 9000, "Furniture", 4);
//			Product p9 = new Product(9, "Water Bottle", 300, "Home & Kitchen", 30);
//			Product p10 = new Product(10, "Backpack", 1500, "Bags", 14);
//						
//			
//			String msg1 = controller.insertProduct(p1);
//			String msg2 = controller.insertProduct(p2);
//			String msg3 = controller.insertProduct(p3);
//			String msg4 = controller.insertProduct(p4);
//			String msg5 = controller.insertProduct(p5);
//			String msg6 = controller.insertProduct(p6);
//			String msg7 = controller.insertProduct(p7);
//			String msg8 = controller.insertProduct(p8);
//			String msg9 = controller.insertProduct(p9);
//			String msg10 = controller.insertProduct(p10);
//			
//			System.out.println(msg1);
//			System.out.println(msg2);
//			System.out.println(msg3);
//			System.out.println(msg4);
//			System.out.println(msg5);
//			System.out.println(msg6);
//			System.out.println(msg7);
//			System.out.println(msg8);
//			System.out.println(msg9);
//			System.out.println(msg10);
//			
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		// update product
		
		try
		{
			Product pro = new Product(1, "Smart Watch", 4500, "Electronics", 10);
			
			 String msg = controller.update(pro);
			
			System.out.println(msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		// Delete single Product into table
		
		
		
	}
}
