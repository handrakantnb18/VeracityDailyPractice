package loopingStatements;

import java.util.Scanner;

public class OnlineTicketBookGlobal {

	public static void main(String[] args) {

		// Movie Booking ticket Global App
		
		// Array, Collection, Object == we can store multiple book  movie

		// Student management system
		//1. Add Student = id, name, marks - -45, 245, address - 20, age > 10, CollegeName  1. student only - > // validate = 
		//2. Appy the Grade > 90 - A, 80 > B
		//3. Display Student Data - sysout (id, name
		//4. Exit
		
		// validate
		
		// do while loop
		
		String movie = " ";
		int qty = 0;
		double ticketPrice = 0;
		double discount = 0;
		double finalPrice = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Saiyara - 250Rs");
			System.out.println("2. Dhurandar - 170Rs");
			System.out.println("3. Bordar 2 - 450Rs");
			System.out.println("4. Kantara - 200Rs");
			System.out.println("5. Exit");

			System.out.println(" Enter your choice to book movie tickit (1 - 4)");
			int choice = sc.nextInt();

			if (choice == 1) {
				movie = "Saiyara";
				System.out.println("You select Saiyara.");
				System.out.println("How many tickits you want ?");

				qty = sc.nextInt();
				ticketPrice = qty * 250;

				if (ticketPrice > 2000) {
					discount = ticketPrice * 0.10;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 1000 && ticketPrice < 2000) {
					discount = ticketPrice * 0.05;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 500 && ticketPrice < 1000) {
					discount = ticketPrice * 0.02;
					finalPrice = ticketPrice - discount;

				}

				else {
					System.out.println("No Discount");

				}
			}

			else if (choice == 2) {
				movie = "Dhurandar";
				System.out.println("You select Dhurandar.");
				System.out.println("How many tickits you want ?");

				qty = sc.nextInt();
				ticketPrice = qty * 170;

				if (ticketPrice > 2000) {
					discount = ticketPrice * 0.10;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 1000 && ticketPrice < 2000) {
					discount = ticketPrice * 0.05;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 500 && ticketPrice < 1000) {
					discount = ticketPrice * 0.02;
					finalPrice = ticketPrice - discount;

				}

				else {
					System.out.println("No Discount");

				}
			}

			else if (choice == 3) {
				movie = "Border 2";
				System.out.println("You select Border 2.");
				System.out.println("How many tickits you want ?");

				qty = sc.nextInt();
				ticketPrice = qty * 450;

				if (ticketPrice > 2000) {
					discount = ticketPrice * 0.10;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 1000 && ticketPrice < 2000) {
					discount = ticketPrice * 0.05;
					ticketPrice = ticketPrice - discount;

				} else if (ticketPrice > 500 && ticketPrice < 1000) {
					discount = ticketPrice * 0.02;
					finalPrice = ticketPrice - discount;

				}

				else {
					System.out.println("No Discount");

				}
			}

			else if (choice == 4) {
				movie = "Kanatara";
				System.out.println("You select Kanatara.");
				System.out.println("How many tickits you want ?");

				qty = sc.nextInt();
				ticketPrice = qty * 200;

				if (ticketPrice > 2000) {
					discount = ticketPrice * 0.10;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 1000 && ticketPrice < 2000) {
					discount = ticketPrice * 0.05;
					finalPrice = ticketPrice - discount;

				} else if (ticketPrice > 500 && ticketPrice < 1000) {
					discount = ticketPrice * 0.02;
					finalPrice = ticketPrice - discount;

				}

				else {
					System.out.println("No Discount");

				}
			}

			else if (choice == 5) {
				System.out.println("Thank you for using movie Booking App.");
				break;
			} else {
				System.out.println("Invalid Choice..");
			}
		} while (true);

		System.out.println("==================== Final Reciept ====================");
		System.out.println("Movie Name : " + movie);
		System.out.println("Qty :" + qty);
		System.out.println("Discount Got : " + discount);
		System.out.println("Final price pay : " + ticketPrice);
		System.out.println("=======================================================");

	}
}
