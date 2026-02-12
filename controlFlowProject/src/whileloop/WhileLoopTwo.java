package whileloop;

import java.util.Scanner;

public class WhileLoopTwo {

	public static void main(String[] args) {

		// online food order system == e-commerce applications
		// 1. pizza = (Rs. 400)
		// 2. Burger = (Rs. 250)
		// 3. VadaPav = (Rs. 30)
		// 4. MisalPav = (Rs. 100)

		// take choice
		// 1. take qty, 3 * 400 = 1200, ? 5000 -> 10% discount, total -> 1500 => 2% =>
		// Discount, Final Price, Product name, qty display

		Scanner sc = new Scanner(System.in);

		double totalAmount = 0;

		while (true) {
			System.out.println("1. Pizza = Rs. 400");
			System.out.println("2. Burger = Rs. 250");
			System.out.println("3. VadaPav = Rs. 30");
			System.out.println("4. MisalaPav = Rs. 100");
			System.out.println("5. Exit");

			System.out.println("Please Enter Choice : ");

			int choice = sc.nextInt();

			double discount = 0;
			
			if (choice == 1) {
				System.out.println("Enter Number of Pizza 1- Rs. 400 : ");

				int pizza = sc.nextInt();

				System.out.println("Number of Pizza : "+pizza);
				
				if (totalAmount >= 5000)
				{
					discount = totalAmount * 0.10;
					System.out.println("Discount : "+discount);
				}
				
				if (pizza > 0) {
					totalAmount = pizza * 400;
					discount = totalAmount * 0.10;
					System.out.println("Total Discount : "+discount);
					System.out.println("Total pizza Amount : " +(totalAmount - discount));
				} else {
					System.out.println("Invalid Numbers.");
					break;
				}

			}
			
			
			else if (choice == 2) {
				System.out.println("Enter number of Burger : ");
				
				int burger = sc.nextInt();
				
				System.out.println("Number of Burger : "+burger);
				
				if (burger > 0)
				{
					totalAmount += burger * 250;
					discount = totalAmount * 0.10;
					System.out.println("Total Discount : "+discount);
					System.out.println("Total Burger Amount : "+(totalAmount - discount));
				}
				else
				{
					System.out.println("Invalid Numbers.");
					break;
				}	
				
			}
			
			else if (choice == 3)
			{
				System.out.println("Enter number of Vadapav : ");
				
				int vadapav = sc.nextInt();
				
				System.out.println("Number of VadaPav : "+vadapav);
				
				if (vadapav > 0)
				{
					totalAmount += vadapav * 30;
					discount = totalAmount * 0.10;
					System.out.println("Total Discount : "+discount);
					System.out.println("Total VadaPav Amount : "+(totalAmount - discount));
				}
				else
				{
					System.out.println("Invalid Numbers.");
					break;
				}
			}
			
			else if (choice == 4)
			{
				System.out.println("Enter number of MisalPav : ");
				
				int misalpav = sc.nextInt();
				
				System.out.println("Number of MisalPav  : "+misalpav);
				
				if (misalpav > 0)
				{
					totalAmount += misalpav * 100;
					discount = totalAmount * 0.10;
					System.out.println("Total Discount : "+discount);
					System.out.println("Total MisalPav Amount :"+(totalAmount - discount));
				}
				else
				{
					System.out.println("Invalid Numbers.");
					break;
				}
			}
			else if (choice == 5) {
				System.out.println("Exit. ");
				break;
			}
			
			else
			{
				System.out.println("Invalid Creadintials... please enter 1 - 5 numbers.");
			}
		}
	}
}
