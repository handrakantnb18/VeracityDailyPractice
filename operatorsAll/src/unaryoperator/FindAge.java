package unaryoperator;

public class FindAge {
	
	public static void main(String[] args) {
		
		// find age eligibility for Driving
		int age = 25;
		
		String s = (age >= 18) ? "You are eligible for Driving" : "You are not eligible for Driving";
		
		System.out.println(s);
		
		int age1 = 15;
		
		String a =(age1 >= 18)? "Your are eligible for Driving" : "You are not eligible for the Driving";
		
		System.out.println("\n"+a);
		
		
	}

}
