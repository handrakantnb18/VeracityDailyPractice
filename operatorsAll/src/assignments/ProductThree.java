package assignments;

import java.util.Scanner;

public class ProductThree {

	public static void main(String[] args) {
		// Product - id, name, category, price, qty
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter Name : ");
		String name = sc.next();

		System.out.println("Enter Catagory : ");
		String catagory = sc.next();

		System.out.println("Enter price : ");
		int price = sc.nextInt();

		System.out.println("Enter Quantity : ");
		int qty = sc.nextInt();

		System.out.println("\nId " + id);

		System.out.println("\nName : " + name);

		System.out.println("\nCategory : " + catagory);

		System.out.println("\nPrice : " + price);

		System.out.println("\nQuantity : " + qty);

		System.out.println("Id : "+id+" Name : "+name+" Category : "+catagory+" Price : "+price+" Quantity : "+qty);
		
		
		
	}
}
