package com.java8featuresAll.features;

public interface Vehicle {

	 // Abstract method
    void start();

    // Default method with implementation
    default void stop() {
        System.out.println("Vehicle stopped.");
    }
}
