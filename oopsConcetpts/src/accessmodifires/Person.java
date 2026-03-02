package accessmodifires;

class PersonOne
{
	// private variable
	// the private access modifier is specified using the keyword private.
	// the methods or data members declared as private are accessible only within the class in which they are declared
	
		private String name;
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
}

public class Person {

	public static void main(String[] args) {
		
		PersonOne p = new PersonOne();
		p.setName("Chandrakant");
		
		System.out.println(p.getName());
	}
	
}
