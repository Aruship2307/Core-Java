package com.java8features.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListOperations {

	public static void main(String[] args) {
		// ifPresent() with method refernce call
        System.out.println("Print the name starts with 'k' : ");
		Stream.of("Java","GO","React","AWS")
		      .filter(s->s.startsWith("k"))                        // predicate arugment
		      .findFirst()
			  .ifPresent(System.out::println);                     // takes consumer as argument
		
		
		      //.ifPresentOrElse(System.out::println, Optional.) try this method also 
	                    
		
		// orElse() method
        System.out.print("Returns length greater than 15: ");
		List<String> list = Arrays.asList("Java", "AWS", "GO", "Docker","K8s","Jenkin","CICD");
		
		String result = list.stream()
				             .filter(s->s.length()>15)
				             .findFirst()
	                         .orElse("None");
		
		System.out.print(result);
		
		// above list reused, groupingBy() by each string to its length
		
		System.out.println("\nDisplay grouping by each string with length ");
		Map<Integer, List<String>> result2 = list.stream()
				                                 .collect(Collectors.groupingBy(String::length));
		
		System.out.print(result2);
		
		
		// above list reused, to convert each string into char with set only unique char will be printed
		System.out.print("\nBy flatMap() to transform each word into a stream of its individual characters.\n");
		Set<String> result3 = list.stream()
		                          .flatMap(s -> Arrays.stream(s.split("")))
		                          .collect(Collectors.toSet());
		System.out.println(result3);
		
		
		//above list reused, Collectors.toMap() create map length each word = key , word=value
		// if multiple words have same length, toMap() collector use merge() combine values. merge() concatenates two values.as string
		
		Map<Integer, String> result4 = list.stream()
				                            .collect(Collectors.toMap(String::length,
				                             Function.identity(),(x1,x2)->(x1+"|"+x2)));
		
		System.out.println(result4);
		
		
		System.out.println("\nDisplay even numbers by partitioningBy(Boolean, List):");
		List<Integer> list2 = Arrays.asList(4,5,7,9,2,6,24,12);
		Map<Boolean, List<Integer>> result5 = list2.stream()
				                                 .collect(Collectors.partitioningBy(x -> x%2==0));
		
		System.out.println(result5);
	}

}
