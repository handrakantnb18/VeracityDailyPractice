package com.patterns.alphabets;

public class NestedPatternA3 {

	public static void main(String[] args) {

		// print alphabets first ways C == COLUMN

		for (char i = 65; i <= 69; i++) {
			for (int j = 65; j <= 69; j++) {
				if (j == 67 && i != 66 && i != 68) {

					System.out.print("4 ");
				} else if (i == 67) {
					System.out.print("* ");
				} else if (i == 67 && j != 67) {
					System.out.print("* ");
				}

				else {
					System.out.print(i + " ");
				}

			}
			System.out.println();
		}
	}

}
