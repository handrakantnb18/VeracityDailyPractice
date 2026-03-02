package accessmodifires;

class Car
{
	String model;
}


// Default Access Modifier 
// when no access modifier is specified for a class, methods, or data number, it is said to have the default access modifier by default

public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.model = "Maruthi";
		
		System.out.println(c.model);
	}
}
