package com.java8features;

import java.util.Arrays;

public class ArrayJava8RemoveDuplicateNumTest {
	public static void removeaDuplicateNumber(int[]arr) {
		int[] duplicateNum = Arrays.stream(arr)
				                 .distinct()
				                 .toArray();
		System.out.print("After removing duplicate elements from array is: ");
		Arrays.stream(duplicateNum).forEach(System.out::print);

	}
	public static void main(String[] args) {
		int[] array = {1,2,4,5,2,3,9,1,8,7}; // 2 is duplicate number to remove
		removeaDuplicateNumber(array);
	}
}

/*
 * public class ArrayRemovDuplicateJava8Test {
    public static void main(String[] args) {
    Integer[] arr = {2,4,9,7,6,4,2,1,3,8,5};
    Integer[] distinctArray = Arrays.stream(arr) // Convert the array to a stream
            .distinct()  // Remove duplicate elements from the stream
            .toArray(Integer[]::new); // Convert the stream back to an array
        System.out.println("Array after removing duplicates: "+Arrays.toString(distinctArray));
Arrays.stream(duplicateNum).forEach(System.out::print); //responsible for printing elements of array duplicateNum to console. 
                                          // It uses Stream API to iterate through elements of array and print each element.
    }
}*/
