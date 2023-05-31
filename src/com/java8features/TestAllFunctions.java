package com.java8features;

import java.util.function.BiConsumer;

public class TestAllFunctions {

	public static void main(String[] args) {

		// BiConsumer(Integer, String) - takes two argument , by complete java 8 use 
		
		BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Addition: "+a+b);
		
		biConsumer.accept(10, 20);
		
		 BiConsumer<String, Integer> printLength = (str, length) -> System.out.println(str + " has length " + length);

	     printLength.accept("Hello", 5);
	     printLength.accept("Java", 4);
	}
	

}
