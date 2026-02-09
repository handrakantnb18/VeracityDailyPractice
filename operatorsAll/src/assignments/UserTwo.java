package assignments;

import java.util.Scanner;

public class UserTwo {

	public static void main(String[] args) {

		// User - id, name, city, contact, email;

		Scanner sc = new Scanner(System.in);

		System.out.println("User id : ");
		int id = sc.nextInt();

		System.out.println("User name : ");
		String name = sc.next();

		System.out.println("User City : ");
		String city = sc.next();

		System.out.println("Contact : ");
		String contact = sc.next();

		System.out.println("Email : ");
		String email = sc.next();
		
		System.out.println("\nUser Id      : "+id);
		
		System.out.println("\nUser Name    : "+name);
		
		System.out.println("\nUser City    : "+city);
		
		System.out.println("\nUser Contact : "+contact);
		
		System.out.println("\nUser Email   :"+email);
	}

}
