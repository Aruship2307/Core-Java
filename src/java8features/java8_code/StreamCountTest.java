package com.java8features;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountTest {

	public static void main(String[] args) {
	    List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
	    
	    // after filter() , count() is final method in stream
	    long count = strList.stream() 
	    		    .filter(x -> x.isEmpty()) 
	    		    .count();
	    
	    System.out.println("Total elements in stream: "+count);
	    
	   // collect() is also final method in stream
		
		List<String> remEmptyString = strList.stream()
				                      .filter(x->!x.isEmpty())
				                      .collect(Collectors.toList());
		
		System.out.println("Remove all empty string form list: "+remEmptyString);

		
		
		// count string whose lenght is more than 3
		
		long len = strList.stream()
				   .filter(x->x.length()>3)
				   .count();
		
		// count no of string which starts with 3
		System.out.println("count string whose lenght is more than 3: "+len);
		
		long countStartsChar = strList.stream()
			                   .filter(x->x.startsWith("a"))
			                   .count();
		
		System.out.println("count no of string which starts with 3"+countStartsChar);
		
		// create a list of string whose char are more than 2
		
		List<String> subsetStr = strList.stream()
				                 .filter(x->x.length()>2)
				                 .collect(Collectors.toList());
		
		System.out.println("Created a list of string whose char are more than 2: "+subsetStr);
		
		// convert String to upperCase and join with comma , 
		
		String convertUpper = strList.stream()
				                    .map(x->x.toUpperCase())
				                    .collect(Collectors.joining(", "));
		
		System.out.println(convertUpper);
		
		
		// create a List of the Square of all distinct no
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());
		System.out.println(distinct);
		
		
		// get count, min, max, sum, and avg of given numbers 
		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		
		System.out.println(stats);

		

	
		
	
	}

}
