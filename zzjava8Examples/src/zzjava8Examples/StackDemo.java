package zzjava8Examples;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Spring");
        stack.push("Hibernate");

        System.out.println("Stack : " + stack);
        
        
	}
}
