package com.java8features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DemoOptional {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 8, 13, 24, 15);

		Optional<Integer> result = numbers.stream()
		                                  .filter(n -> n > 25)
		                                  .reduce((a, b) -> a + b);
		System.out.println(result);
	}

}
