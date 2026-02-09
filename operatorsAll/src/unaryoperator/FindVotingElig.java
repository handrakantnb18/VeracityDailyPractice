package unaryoperator;

public class FindVotingElig {

	public static void main(String[] args) {
		
		// Checking Eligible for the voting
		int age = 25;
		
		String a = (age >= 18)? "Eligible for Voting" : "Not eleigible for Voting";
		
		System.out.println(a);
		
		String b = (age <= 18)? "Eligible for the Voting" : "Not eligible for voting";
		
		System.out.println("\n"+b);
		
	}
}
