package com.java8features;
import java.util.Arrays;

public class ArrayJava8CommonElementsChecks {
	
	public static int[] checkCommonElements(int []arr1, int[]arr2){
		int [] arr3 = Arrays.stream(arr1)  // converted arr1 to stream of integers
              .filter(number->Arrays.stream(arr2) //filter element arr1 stream, check number-> each element in arr1 is present in arr2
              .anyMatch(num -> num == number))   // if arr1 & arr2 element is same anyMatch return true.
              .distinct() // to avoid duplicate elements
              .toArray(); // convert the stream to an array
		return arr3;
	}
	public static void main(String[] args) {
	  // given two arrays and find the common elements between them
       int[] array1 = {2,5,3,9,8,11};
       int[] array2 = {7,8,2,1,6,5};  // 2 is common in 2 arrays
	   System.out.println("common elements in given two array is: ");
       int[] result = checkCommonElements(array1, array2);
		Arrays.stream(result).forEach(System.out::print);

	}
}

/*below piece of code will print stream
 *  int [] arr3 = Arrays.stream(arr1)
                .filter(number->Arrays.stream(arr2).anyMatch(num -> num == number))
                 .distinct() // to avoid duplicate elements
                 .forEach(System.out::print);
                 	// 		Arrays.stream(arr3).forEach(System.out::print);
		//   System.out.println("common elements in given two array is: "+arr3);
		 return arr3;*/
