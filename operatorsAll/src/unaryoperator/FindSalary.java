package unaryoperator;

public class FindSalary {
	
	public static void main(String[] args) {
		
		// find salary with experience
		
		int exp = 4;
		
		double salary = 40000;
		
		double findSalary = (exp >=5 ) ? salary + 5000: salary + 2000;
		
		System.out.println(findSalary);
		
		// find salary with experience greater than 5
		
		double sal = (exp <= 5) ? salary + 5000 : salary + 2000;
		
		System.out.println(sal);
		
	}
}
