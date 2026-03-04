package com.interface2;

import com.interface1.Test;

public interface Demo {

	// different package and child class access
	
	public static void main(String[] args) {
		System.out.println(Test.id);
	}
}
