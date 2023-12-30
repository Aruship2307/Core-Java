package com.java8features;

import java.util.Arrays;

public class ArrayFindSecMin {
	
	public static void fetchSecondSmallest(int arr[]) {
		int secondSmallNumber = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()->new IllegalArgumentException());
	   System.out.println("Second Smallest element: "+secondSmallNumber);
	}

	public static void main(String[] args) {

        int numbers [] = {1,2,5,8,9,8,5,1};
     
        // method invoking
        fetchSecondSmallest(numbers);
	}

}
