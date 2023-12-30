package com.java8features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class ContactDetails {
	int number;
	String name;
	
	public ContactDetails(String name, int number) {
		super();
		this.number = number;
		this.name = name;
	}
	
}

public class CustomBiFunction {

	public static void main(String[] args) {
		
	ArrayList<ContactDetails> al = new ArrayList<>();

    BiFunction<String, Integer, ContactDetails> bi = (number,name)-> new ContactDetails(number,name);
    
    al.add(bi.apply("Shruti", 26));
    al.add(bi.apply("srikant", 19));
    al.add(bi.apply("sachin", 96));
    al.add(bi.apply("harshali", 10));
    al.add(bi.apply("saurabh", 06));
    al.add(bi.apply("viki", 26));
    
    for(ContactDetails cd:al) {
    	System.out.println("Contact name: "+cd.name);
    	System.out.println("Contact Number: "+cd.number);
    }
	}

}
