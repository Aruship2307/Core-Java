package com.java8features;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo2 {

	public static void main(String[] args) {
		   Predicate<String> bestStooge = s -> s.equals( "Cricket" );
		   System.out.printf( "The best game is %1s", 
		                Stream.of( "Hocky", "Cricket", "Football", "Vollyball", 
		                                 "Table Tennis", "Running" ).
		                            filter( bestStooge ).
		                            findFirst().
		                            orElse( "N/A" ) );
	}

}
