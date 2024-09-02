package com.java8features;

import java.util.stream.IntStream;

public class StreamIntIteration {

	public static void main(String[] args) {

		// imperative approach - how style of program
		int sum=0;
		for(int i=0;i<100;i++) {
			sum+=i;
		}
		System.out.println("Sum by imperative approach: "+sum);
		
		// declarative approach - what style of 
		
		int sum1 = IntStream.rangeClosed(0, 100)
		          .sum();
		
		System.out.println("Sum by declrative approach: "+sum1);
		
		// multithreaded enviroment-use parallel process approach
		
		int sum2 = IntStream.rangeClosed(0,100)    // it splits the values in multi threaded enviroment
				  .parallel()
				  .sum();
		
		System.out.println("Sum by parallel or multithread approach: "+sum2);
	}
	

}
