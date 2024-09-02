package com.java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiConsumerAllInterfaces {

	public static void main(String[] args) {
		
		// BiPredicate 
     	BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
	    System.out.println(p.test(10, 20));

	    // BiConsumer
		BiConsumer<String, String> bc = (s1,s2) -> System.out.println(s1+s2);
		bc.accept("Rushikesh", "Panchal");
		
		// BiFunction 
	    BiFunction<Integer, Integer, Integer> f = (a, b) -> a * b;
        System.out.println(f.apply(10, 20));
	}

}


// 