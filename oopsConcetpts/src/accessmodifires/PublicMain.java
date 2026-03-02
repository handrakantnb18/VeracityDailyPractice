package accessmodifires;

class MathUtils
{
	public static int add(int a, int b)
	{
		return a + b;
	}
}


// Public Access modifiers is specified using the keyword public
// public members are accessible from anywhere in the program
// ther is no restriction on the scope of public data members

public class PublicMain {

	public static void main(String[] args) {
		System.out.println(MathUtils.add(10, 20));
		
	}
}
