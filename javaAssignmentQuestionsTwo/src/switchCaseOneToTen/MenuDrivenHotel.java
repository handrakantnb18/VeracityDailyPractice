package switchCaseOneToTen;

import java.util.Scanner;

public class MenuDrivenHotel {

	public static void main(String[] args) {

		// Create a menu-driven program for hotel items using switch case.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice ");

		int choice;
		int quantity;
	 	double discount;
	 	double finalAmount;
		int totalBill = 0;

		
		
		do {
			System.out.println("1. Pizza - 350 Rs ");
			System.out.println("2. Burger - 250 Rs ");
			System.out.println("3. Vada Pav - 20 Rs ");
			System.out.println("4. Sandwich - 100 Rs ");
			System.out.println("5. Exit ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Quantity : ");
				System.out.println("----------- ###### ----------");
				quantity = sc.nextInt();
				totalBill += quantity * 350;
				System.out.println("Pizza Total Amount " + totalBill);
				
				discount = totalBill * 0.10;
				System.out.println("Discount is : "+discount);
				finalAmount = totalBill - discount;
				System.out.println("Final Amount : "+finalAmount);
				break;

			case 2:
				System.out.println("Enter Quantity : ");
				System.out.println("----------- ###### ----------");
				quantity = sc.nextInt();
				totalBill += quantity * 250;
				System.out.println("Burger total Amount : " + totalBill);
				discount = totalBill * 0.05;
				System.out.println("Discount is : "+discount);
				finalAmount = totalBill - discount;
				System.out.println("Final Amount : "+finalAmount);
				break;

			case 3:
				System.out.println("Enter Quantity : ");
				System.out.println("----------- ###### ----------");
				quantity = sc.nextInt();
				totalBill += quantity * 20;
				System.out.println("Vada Pav Total amount : " + totalBill);
				discount = totalBill * 0.03;
				System.out.println("Discount is : "+discount);
				finalAmount = totalBill - discount;
				System.out.println("Final Amount : "+finalAmount);
			
				break;

			case 4:
				System.out.println("Enter Quantity : ");
				System.out.println("----------- ###### ----------");
				quantity = sc.nextInt();
				totalBill += quantity * 100;
				System.out.println("Sandwich total amount : " + totalBill);
				discount = totalBill * 0.02;
				System.out.println("Discount is : "+discount);
				finalAmount = totalBill - discount;
				System.out.println("Final Amount : "+finalAmount);
				break;

			case 5:
				System.out.println("Exit");
				break;

			case 6:
				System.out.println("Enter Correct Number ");
				return;
			}
		} while (true);
	}
}
