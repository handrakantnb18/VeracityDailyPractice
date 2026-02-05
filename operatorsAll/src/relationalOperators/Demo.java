package relationalOperators;

public class Demo {

	public static void main(String[] args) {
		int x = 200, y = 50;

		System.out.println(x < y && x == y); // false

		System.out.println(x < y && x > y); // false

		System.out.println(x > y && x < y); // false

		System.out.println(x > y && x != y); // true

		System.out.println("\n");
		// int num3 = 100, num4 = 100; // true, false, false, false

		int num3 = 100, num4 = 10; // false, true, true, true

		System.out.println(num3 < num4 || num3 == num4); // false
		// false false // false false = false

		System.out.println(num3 > num4 || num3 < num4); // true
		// true false // true false = true

		System.out.println(num3 < num4 || num3 > num4); // true
		// false true // false true = true

		System.out.println(num3 > num4 || num3 != num4); // true
		// true true // true true = true

	}

}
