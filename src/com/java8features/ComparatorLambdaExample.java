package com.java8features;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {  // o1==o1-> 0, o1>o2 -> 1, o1<o2->-1
				return o1.compareTo(o2);
			}
		};
		System.out.println("before java 8 Result : "+comparator.compare(5, 3));
		
		
		// After java 8 implement comprator // (Integer n1,Integer n2) -> { return n1.compareTo(n2);} 
		
		Comparator<Integer> comparator2 = (n1,n2) ->  n1.compareTo(n2);   // implemented comprator 
		System.out.println("After java 8 by lambda Result : "+comparator2.compare(8, 4));


	}

}
