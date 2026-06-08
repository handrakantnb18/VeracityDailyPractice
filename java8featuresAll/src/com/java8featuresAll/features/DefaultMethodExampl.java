package com.java8featuresAll.features;

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

public class DefaultMethodExampl {

	 public static void main(String[] args) {
	        Vehicle car = new Car();
	        car.start(); 
	        car.stop(); 
	    }
}
