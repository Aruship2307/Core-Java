package com.java8features;

import java.util.function.Predicate;

// program to check given number is less than 10 or not 

/*interface Predicate<T>{
	public boolean m1(T t);
}*/


public class TestPredFunc {

	public static void main(String[] args) {
     
		Predicate<Integer> p =  I ->  I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(8));

	}

}
