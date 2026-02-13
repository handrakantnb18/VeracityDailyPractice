package loopingStatements;

public class NestedDoWhile {

	public static void main(String[] args) {
		
		// Nested Do While Check the condition
		
		int i = 1;
		
		do {
			
			System.out.println("Chandr");
			i++;
			
			int j = 1;
			do {
				System.out.println("Bhosale");
				j++;
			}while (j <= 5);
			
		}while (i <= 5);
	}
}
