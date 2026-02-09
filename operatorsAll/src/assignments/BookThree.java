package assignments;

import java.util.Scanner;

public class BookThree {

	public static void main(String[] args) {
		// Book - id, name, auther, price
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id : ");
		int id = sc.nextInt();

		System.out.println("Enter Name : ");
		String name = sc.next();

		System.out.println("Enter Auther : ");
		String auther = sc.next();

		System.out.println("Enter Price : ");
		int price = sc.nextInt();

		System.out.println("Enter Id : "+id);
		
		System.out.println("Enter Name : "+name);
		
		System.out.println("Enter Auther : "+auther);
		
		System.out.println("Enter Price : "+price);
		

		System.out.println("\nId is : "+id+" Name : "+name+" Auther : "+auther+" Price : "+price);
		
		
	}
}
