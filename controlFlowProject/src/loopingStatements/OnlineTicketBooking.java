package loopingStatements;

import java.util.Scanner;

public class OnlineTicketBooking {

	public static void main(String[] args) {
		
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


