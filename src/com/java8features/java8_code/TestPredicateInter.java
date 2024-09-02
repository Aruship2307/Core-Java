package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestPredicateInter {

	public static void main(String[] args) {

		//predicate .. always gives result in boolean 
	Predicate<String> chkLength = s->s.length()>=5;
	System.out.println("The length of string is  greater than 5: "+ chkLength.test("Java Code"));
	
	Predicate<String > chkEven = s->s.length()%2==0;
	System.out.println("The string is even: "+ chkEven.test("Java Code"));
	
	// Joining two predicate by And
	
	System.out.println("After joining by And: "+ chkLength.and(chkEven).test("Java Code"));
	
	// Joining two predicate by Or
	System.out.println("After joining by Or: "+chkLength.or(chkEven).test("Java Code"));

	// Joining two predicate by Negate
	
	System.out.println("After joining by Negate: "+chkLength.negate().test("Java Code"));
	
	// Function Interface, apply() method 
	
	Function<Integer, Integer> funSquare = i -> i*i;
	
	System.out.println("Square of Number by Function Interface: "+funSquare.apply(5));
	
	// function chaining by andThen and compose
	
	Function<Integer, Integer> twice = i->2*i;
	System.out.println("Multiply by 2: "+twice.apply(2));
	
	
	Function<Integer, Integer> cube = i->i*i*i;
	System.out.println("Cube of 2: "+cube.apply(2));
	
	// chaining above function by andThen and compose
	
	System.out.println("Function chaining by andThen: "+ twice.andThen(cube).apply(2));
	
	System.out.println("Function chaining by consume: "+twice.compose(cube).apply(2));
	
	// to check the name starts with k 
	
	String [] names = {"ben","faf","southee","shane","sachin","Brendon"};
	
	Predicate<String> startwithk = s->s.charAt(0)=='s';
	System.out.println("Name starts with k:");
	for(String s:names) {
	if(startwithk.test(s)) {
		System.out.println(s);
	  }
	}
	}

}
