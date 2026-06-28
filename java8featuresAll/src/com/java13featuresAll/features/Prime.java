package com.java13featuresAll.features;

public class Prime {

	public static void main(String[] args) {
		
		int num=92;
        boolean prime=true;

        for(int i=2;i<=Math.sqrt(num);i++){

            if(num%i==0){
                prime=false;
                break;
            }
        }

        System.out.println(prime?"Prime":"Not Prime");
        
	}
}
