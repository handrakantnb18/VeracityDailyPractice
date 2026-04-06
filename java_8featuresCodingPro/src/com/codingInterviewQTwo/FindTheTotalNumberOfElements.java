package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {

	public static void main(String[] args) {
		
//		 List<Integer> myList = Arrays.asList(9,8,77,10,15,8,49,25,98,98,32,15);
//         long count =  myList.stream()
//                             .count();
//         System.out.println(count);   

         int[] arr = {10,15,8,49,25,98,98,32,15};
         
         Arrays.stream(arr).boxed().count();  
         System.out.println();
	}
}
