package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsTest {

	public static void main(String[] args) {
		 ArrayList<Integer>  al = new ArrayList<>();
		    al.add(10);
		    al.add(15);
		    al.add(23);
		    al.add(35);
		    al.add(46);
		    
		   
		   	//  by using Stream API chech odd numbers (java 1.8 coding approach)
		   	
		   	List<Integer> stl = al.stream().filter(I->I%2!=0).collect(Collectors.toList());
		   	
		   	System.out.println("Odd number by Stream API filter(): "+stl);
		   	
		   	// by stream. map() to map object
		   	
		   	List<Integer> sum = al.stream().map(I->I*2).collect(Collectors.toList());
		   	
		   	System.out.println("Number multiplication by Stream API map() : "+sum);

		   	
		    // OR --- old approach to write collection code
		   	//to store even number list in new collection
		    ArrayList <Integer> aln = new ArrayList<>();
		    
		    for(Integer i: al) {
		        if(i%2==0)
		        aln.add(i);
		    }
		   	System.out.println("Even number list: "+aln);
		   	
		   	
		  	// filtered string starts with c & them map String as uppercase 
		    Arrays.asList("a1", "a2", "b1", "c2", "c1")
	            .stream()
	            .filter(s -> s.startsWith("c"))
	            .map(String::toUpperCase)
	            .sorted()
	            .forEach(System.out::println);
		   

	}

}
