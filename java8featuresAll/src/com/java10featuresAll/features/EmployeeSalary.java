package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSalary {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(101, "Shivraj", "IAS", 150000),
                new Employee(102, "Rahul", "IPS", 120000),
                new Employee(103, "Amit", "Engineer", 80000),
                new Employee(104, "Rohit", "Manager", 100000)
        );

        list.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .forEach(System.out::println);
    }
}