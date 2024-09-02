package com.java8features;

import java.util.Arrays;
import java.util.List;

public class Java8ArrayEvenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = Arrays.asList(2,4,5,8,3,1,6);
		
		int sumOfEvens =  al.stream()
		  .filter(x->x%2==0)
		  .mapToInt(Integer::intValue).sum();
		
		System.out.println("Even number: "+sumOfEvens);
		
		int sumOfOdds =  al.stream()
				  .filter(x->x%2!=0)
				  .mapToInt(Integer::intValue).sum();
		
		System.out.println("Odd number: "+sumOfOdds);



	}

}
