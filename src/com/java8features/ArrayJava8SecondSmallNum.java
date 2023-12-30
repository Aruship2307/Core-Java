package com.java8features;

import java.util.Arrays;

public class ArrayJava8SecondSmallNum {
	
	public static int checkSecondSmallNum(int[] arr) {
		int secSmallNum  = Arrays.stream(arr)
				                 .distinct()
				                 .skip(1)
				                 .findFirst()
				                 .orElseThrow(()-> new IllegalArgumentException("No Such second element found in given array"));
		System.out.println("Second smallest number form array is: "+secSmallNum);
		return secSmallNum;
	}

	public static void main(String[] args) {
      int [] array = {2,5,3,9,7,6,8};
      checkSecondSmallNum(array); 
	}
}
