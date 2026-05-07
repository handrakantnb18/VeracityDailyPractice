package com.Day8.java8program;

public class Employee {

	// 11. Group employees by department
	int id;
    String name;
    String dept;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public String toString() {
        return name;
    }

}
