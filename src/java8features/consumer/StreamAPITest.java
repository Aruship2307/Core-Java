package com.java8features.consumer;

import java.util.Comparator;
import java.util.stream.IntStream;

public class StreamAPITest {

	public static void main(String[] args) {
		
		// IntStream.rangeClosed() - first & second both are inclusive == to display even number
		System.out.print("Display even numbers: ");
		IntStream.rangeClosed(0, 10)
		          .filter(x->x%2==0)
		          .forEach(System.out::print);
		
		//map Square of each element, by skip() = first two squares, similiar to count but just skipping done 
		// [1,4,9,16,25] skips first 2 by skip() == o/p [9,16,25]
		System.out.print("\nDisplay square of each elements by skip first 2 elements: ");
		IntStream.rangeClosed(1, 5)
                 .map(i -> i * i)
                 .skip(2)
                 .forEach(System.out::print);
		
		// IntStream.range() - (first=Inclusive)  && (last=exclusive) 
		System.out.println("\nrange(0,5) map each Integer to: 'a' ");
		IntStream.range(0, 5)
                 .mapToObj(b-> "a" + b)
                 .sorted(Comparator.reverseOrder())
                 .forEach(System.out::println);
		
		System.out.print("\nPrints the list of Integer by Limit(3) to Stream API: ");
		IntStream.range(24, 96)
                  .limit(3)
                  .mapToObj(Integer::toString)
                  .forEach(System.out::print);
		
	
		
/*     can't convert list of strings to list of characters 
		List<String> words = Arrays.asList("hello", "world");
		List<Character> letters = words.stream()
		                               .flatMap(s -> Stream.of(s.split("")))
		                               .collect(Collectors.toList());
		System.out.println(letters);*/
		
		
		
	}

}
