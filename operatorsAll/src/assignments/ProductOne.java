package assignments;

import java.util.Scanner;

public class ProductOne {

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
		
		String result = ("Id : "+id+" Name : "+name+" Catagory : "+catagory+" Price : "+price+"Quantity : "+qty);
		
		System.out.println(result);
		
	}
}
