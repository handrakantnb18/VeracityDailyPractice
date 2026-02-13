package loopingStatements;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// entry control point

//		for (int i=1; i<=10; i++) // ENTRY Point
//		{
//			System.out.println("Hello");
//		}

		// Do while loop is Exit control loop

		// Do While loop check condition ins change using i++;
//		int i = 1;
//		
//		do {
//			System.out.println("Hello");
//			i++;
//		}while(i <= 10);

		// print Even and Odd numbers

//		int i = 1;
//		
//		do {
//			if (i % 2 != 0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}while(i <= 10);

		// print only those numbers which are divisible by 3 and 5

//		int i = 1;
//		
//		do {
//			if (i % 3 == 0 && i % 5 == 0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}while(i <= 200);

		// factorial numbers calculate 5
		
//		int i = 1;
//
//		do {
//			if (i == 5) {
//				System.out.println(i);
//			}
//			i++;
//		} while (i <= 10);
//		
		// multiplication table
		
		
		// Movie Booking table
		
		String movie = " ";
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("1. Saiyara - 250Rs");
			System.out.println("2. Dhurandar - 170Rs");
			System.out.println("3. Bordar 2 - 450Rs");
			System.out.println("4. Kantara - 200Rs");
			System.out.println("5. Exit");
			
			System.out.println(" Enter your choice to book movie tickit (1 - 4)");
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				movie = "Saiyara";
				System.out.println("You select Saiyara.");
				System.out.println("How many tickits you want ?");
				
				int qty = sc.nextInt();
				double tickitPrice = qty * 250;
				
				if(tickitPrice > 2000)
				{
					double discount =tickitPrice * 0.10;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 1000 && tickitPrice < 2000)
				{
					double discount =tickitPrice * 0.05;
					double finalPrice = tickitPrice - discount;

					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				
				}
				else if (tickitPrice > 500 && tickitPrice < 1000)
				{
					double discount =tickitPrice * 0.02;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
				
				else 
				{
					System.out.println("No Discount");

					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
			}
			
			
			else if(choice == 2)
			{
				movie = "Dhurandar";
				System.out.println("You select Dhurandar.");
				System.out.println("How many tickits you want ?");
				
				int qty = sc.nextInt();
				double tickitPrice = qty * 170;
				
				if(tickitPrice > 2000)
				{
					double discount =tickitPrice * 0.10;
					double finalPrice = tickitPrice - discount;
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 1000 && tickitPrice < 2000)
				{
					double discount =tickitPrice * 0.05;
					double finalPrice = tickitPrice - discount;

					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 500 && tickitPrice < 1000)
				{
					double discount =tickitPrice * 0.02;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				
				else 
				{
					System.out.println("No Discount");
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
			}
			
			
			else if(choice == 3)
			{
				movie = "Border 2";
				System.out.println("You select Border 2.");
				System.out.println("How many tickits you want ?");
				
				int qty = sc.nextInt();
				double tickitPrice = qty * 450;
				
				if(tickitPrice > 2000)
				{
					double discount =tickitPrice * 0.10;
					double finalPrice = tickitPrice - discount;


					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 1000 && tickitPrice < 2000)
				{
					double discount =tickitPrice * 0.05;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 500 && tickitPrice < 1000)
				{
					double discount =tickitPrice * 0.02;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				
				else 
				{
					System.out.println("No Discount");
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
			}
			
			
			else if(choice == 4)
			{
				movie = "Kanatara";
				System.out.println("You select Kanatara.");
				System.out.println("How many tickits you want ?");
				
				int qty = sc.nextInt();
				double tickitPrice = qty * 200;
				
				if(tickitPrice > 2000)
				{
					double discount =tickitPrice * 0.10;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 1000 && tickitPrice < 2000)
				{
					double discount =tickitPrice * 0.05;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				else if (tickitPrice > 500 && tickitPrice < 1000)
				{
					double discount =tickitPrice * 0.02;
					double finalPrice = tickitPrice - discount;
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					System.out.println("Discount Got : "+discount);
					System.out.println("Final price pay : "+ finalPrice);
					System.out.println("=======================================================");
					
				}
				
				else 
				{
					System.out.println("No Discount");
					
					System.out.println("==================== Final Reciept ====================");
					System.out.println("Movie Name : "+movie);
					System.out.println("Qty :"+qty);
					
					System.out.println("Final price pay : "+ tickitPrice);
					System.out.println("=======================================================");
					
				}
			}
			
			else if(choice == 5)
			{
				System.out.println("Thank you for using movie Booking App.");
				break;
			}
			else
			{
				System.out.println("Invalid Choice..");
			}
		} while (true);
		
	}
}


