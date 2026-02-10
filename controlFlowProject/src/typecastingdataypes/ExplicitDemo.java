package typecastingdataypes;

public class ExplicitDemo {
	
	public static void main(String[] args) {
		
		
		// char = byte, int, short, long, float, double, 
		
		char c = 66;
		
		System.out.println(c);
		
		char cc = (char)65.45;
		
		System.out.println(cc);
		
		// char x = (char)true; // can not cast char to boolean
		
		// char = int, short, byte, long, float, double
		
//		char c = 'A';  // 2 byte
//		
//		byte b = (byte)c;  // 1 byte  Explicit
//		
//		short s = (short)c;  // 2 byte  Explicit
//		
//		int i = c; // 4 byte  Implicit
//		
//		long l = (long)c; // 8 byte  Implicit
//		
//		float f = c;  // implicit
//		
//		double d = c; // Implicit
//		
//		
//		System.out.println(d);
//		
	}

}
