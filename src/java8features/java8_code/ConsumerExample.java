package com.java8features;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //consumer implements 
		  Consumer<String> c = (s)-> System.out.println(s.toUpperCase());
         c.accept("java");
	}

}
