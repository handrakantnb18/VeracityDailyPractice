package loopingStatements;

public class NestedForNumbersPatterns {
	
	public static void main(String[] args) {
		
		
		// numbers patterns
		// print 1 to 5 all line with debugging
		
		for (int i = 1; i <=5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
