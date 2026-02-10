package typecastingdataypes;

import javax.sound.midi.Soundbank;

public class Demo {

	public static void main(String[] args) {
		
//		// implicit typecasting
//		byte b = 100;
//		
//		short s = b;
//		
//		int i = s;
//		
//		long l = i;
//		
//		float f = l;
//		
//		double d= f;
//		
//		// char , boolean - special typecasting need
//		
//		System.out.println(f);
		
		
		// Explicit typecasting developer responsible 
		
		double balance = 450000.56;  // convert into string
		
		float f = (float)balance;
		
		long l = (long)f;
		
		int i = (int)l;
		
		short s = (short)i;
		
		byte b= (byte)s;
		
		System.out.println(f); // no data loss
		
		System.out.println(l); // data lose
		
		System.out.println(i); // data is loss
		
		System.out.println(s); // data is loss;
		
		System.out.println(b); // data loss
	}
}
