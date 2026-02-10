package IFElseStatement;

public class NestedIF {
	public static void main(String[] args) {

		
		// check the If condition all true the work
		// if first condition false then donot run the program
		// all are dipend upon the each other
		
		// program 1
		if (true) {
			System.out.println("If 1");
			if (true) {
				System.out.println("If 2");
				if (true) {
					System.out.println("If 3");
				}
			}
		}
		else {
		System.out.println("Outer if");
		}
		
		// program 2
		if (false) {
			System.out.println("If 1");
			if (true) {
				System.out.println("If 2");
				if (true) {
					System.out.println("If 3");
				}
			}
		}
		else {
		System.out.println("Outer if");
		}
		
		// program 3
		if (true) {
			System.out.println("If 1");
			if (false) {
				System.out.println("If 2");
				if (true) {
					System.out.println("If 3");
				}
			}
		}
		else {
		System.out.println("Outer if");
		}
	}

}
