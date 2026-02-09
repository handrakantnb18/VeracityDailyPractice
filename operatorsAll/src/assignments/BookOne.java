package assignments;

import java.util.Scanner;

public class BookOne {

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
		
		System.out.println("id :"+id+" Name : " +name+" Auther : "+auther+" Price"+price);
		

				// System.out.println(result);
		
	}
}
