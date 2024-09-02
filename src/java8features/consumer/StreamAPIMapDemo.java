package com.java8features.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamAPIMapDemo {

	public static void main(String[] args) {
		System.out.print("Total sum of each string in StreamAPI: ");
		System.out.println(Stream.of("Cognizant", "Infosys", "Amdocs")
			      .map(s -> s.length())
			      .reduce(0, Integer::sum));
		
		
		
		// Hashmap with mapToInt()
		
		Map<String, Integer> hm = new HashMap<>();
		         hm.put("Sachin", 28);
		         hm.put("Pavan", 27);
		         hm.put("Shruti",23);
		         hm.put("Mrunal", 20);
		         hm.put("Vaibhav", 26);
		         
		int result = hm.entrySet().stream()                   // creates a stream of Map.Entry objects using  entrySet() method. 
				                  .filter(entry->entry.getValue()>25)
				                  .mapToInt(entry->entry.getValue())     // mapToInt() = resulted entries to values 
				                  .sum();
		
		System.out.println("Sum of ages: "+result);
		
		// Returns a substring of each String in Stream API
		System.out.print("\nReturns a substring of each String in StreamAPI: ");
		Stream.of("spring", "hibernate", "jdbc")
	          .map(s -> s.substring(2, 3))
	          .forEach(System.out::print);
		
		
		//stream of streams into a single stream of boxed integers using flatMap() 
		// resulting stream will contain Unicode values of chars in each string , then concantenate into a single  stream.forEach()
		
		System.out.print("\nEach string in StreamAPI, boxted to an integer: ");
		Stream.of("java", "python", "react")
	          .flatMap(s -> s.chars().boxed())   
	          .forEach(System.out::print);
	}

}
