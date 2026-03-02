package accessmodifires;

class Vehical
{
	protected int speed;
}

class Bike extends Vehical
{
	void setSpeed(int s)
	{
		speed = s;
	}
	
	int getSpeed()
	{
		return speed;
	}
}

// Protected Access modifiers specified using the keyword protected

public class ProtectedModifiers {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.setSpeed(100);
		
		System.out.println("Access via subclass method :"+b.getSpeed());
		
		Vehical v = new Vehical();
		System.out.println(v.speed);
	}
}
