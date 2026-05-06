package com.Day7.importantporgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9};

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
    }
}
