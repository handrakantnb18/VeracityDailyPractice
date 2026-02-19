package switchCaseOneToTen;

import java.util.Scanner;

public class VowelCharactor {

	public static void main(String[] args) {

		// 4. Check whether a character is vowel or consonant using switch case.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charactor : ");
		char c = sc.next().charAt(0);

		switch (c) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Charactor is Vowel.");
			break;

		default:
			System.out.println("This is not Charactor is Vowel.");
			break;

		}
	}
}
