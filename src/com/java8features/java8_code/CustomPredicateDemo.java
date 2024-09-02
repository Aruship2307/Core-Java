package com.java8features;

@FunctionalInterface
interface Div{                 
	boolean test(int a, int b);
}
public class CustomPredicateDemo {

	public static void main(String[] args) {

		Div dref = (a,b)-> a/b==0;     // Div interface obj created using lambda function 
		
		System.out.println(dref.test(9, 3));  // true
		System.out.println(dref.test(11, 3));  // false
	}

}


