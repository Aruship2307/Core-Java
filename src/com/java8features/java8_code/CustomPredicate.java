package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer num){

		return num%2==0;
	}
	

	public static void main(String[] args) {

		Predicate<Integer> evCheck = new CustomPredicate();
		
		boolean isEven = evCheck.test(10);
		boolean isOdd = evCheck.test(5);
		
		System.out.println(isEven);
		System.out.println(isOdd);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(13);
		numbers.add(20);
		numbers.add(4);
		
		List<Integer> even = numbers.stream()
		.filter(evCheck)
		.collect(Collectors.toList());
		System.out.println(even);
	}

	

}
