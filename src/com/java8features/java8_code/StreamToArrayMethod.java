package com.java8features;

import java.util.ArrayList;

public class StreamToArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(99);
		al.add(28);
		al.add(8);
		al.add(20);
		al.add(97);
		
		System.out.println("By Arraylist: "+al);
		
		// by forEach to traverse arraylist print one by one
		al.stream().forEach(i->System.out.println(i));
		
		// by toArray method to convert arrayList to array
		Integer [] array = al.stream().toArray(Integer[] :: new );
		System.out.println("By Array");
		
		for(Integer i:array) {
			System.out.println(i);
		}
		
		// checking min and max value from list
		Integer min = al.stream().min((n1,n2)-> n1.compareTo(n2)).get();
		System.out.println("Min value from list: "+min);
		
		Integer max = al.stream().max((n1,n2)-> n1.compareTo(n2)).get();
		System.out.println("Max value from list: "+max);
		
		// checking 

	}

}
