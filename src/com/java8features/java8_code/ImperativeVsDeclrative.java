package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Remove duplicates values from list
public class ImperativeVsDeclrative {

	public static void main(String[] args) {
		
		// imperative approach - to remove duplicate from list
		
		List<String> stringList = Arrays.asList("sai", "saurabh", "vaibhav","pavan", "dikshant","sai", "shruti", "vaibhav", "pavan");
		
		List<String> uniqueList = new ArrayList<>();
		
		for(String string : stringList) {
			if(!uniqueList.contains(string)) {
				uniqueList.add(string);
			}
		}
		
		System.out.println("Unique List by imperative approach    : "+uniqueList);
		
		// declarative approach - to remove duplicates from list, distinct = display only unique elements
		
	   List<String> uniqueList2 =  stringList.stream()
	                                .distinct()
	                                .collect(Collectors.toList());
	   
	   System.out.println("unique list by declarative approach: "+ uniqueList2);
		
		
		
		

	}

}
