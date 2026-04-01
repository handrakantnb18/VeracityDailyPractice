package com.predefinedjavagenerics;

public interface Priyanka<T> {

	// T is Type
	
	void run(T t);
	
	public static void main(String[] args) {
		
		Priyanka<String> p = (x) ->
		{
			System.out.println(x);
		};
		
		p.run("Priyanka bhosale");
		
		Demo<Integer> d=(a, b) ->
		{
			System.out.println(a+b);
		};
		
		d.add(25, 50);
		
	}
}

interface Demo<T>{
	
	void add(T t1, T t2);
}