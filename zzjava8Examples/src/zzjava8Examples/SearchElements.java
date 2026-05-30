package zzjava8Examples;

import java.util.ArrayList;

public class SearchElements {
public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Shivraj");
	list.add("Priyanka");
	list.add("Chandrakant");
	list.add("Bhosale");
	
	String str = "Bhosale";
	
	if(list.contains(str))
	{
		System.out.println("Found : "+str);
	}
	else
	{
		System.out.println("Not Found : "+str);
	}
	
}
}
