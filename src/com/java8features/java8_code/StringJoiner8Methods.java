package com.java8features;

import java.util.StringJoiner;

public class StringJoiner8Methods {

	public static void main(String[] args) {


		  StringJoiner js2 = new StringJoiner(","); // passing comma(,) as delimiter   
          
		  System.out.println("by String CharSequence as Delimeter");
		  
	        // Adding values to StringJoiner  
		  js2.add("Rahul");  
		  js2.add("Raju");  
		  js2.add("Peter");  
		  js2.add("Raheem");  
	                  
	        System.out.println(js2);  
	       
	        
	        // By CharSequence, Prefix, Suffix
	        StringJoiner sj = new StringJoiner(",", "[", "]");
	        
			  System.out.println("by String CharSequence, Prefix, Suffix as Delimeter");

	        
	        // Adding values to StringJoiner  
	        sj.add("Aishwarya");  
	        sj.add("Shruti");  
	        sj.add("Kavita");  
	        sj.add("Mrunal"); 
	        
	        System.out.println(sj);
	        
	        
	        // String merge
	        StringJoiner sj3 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
	        
			  System.out.println("by String Merge combine two different String");

	        // Adding values to StringJoiner  
	        sj3.add("Rahul");  
	        sj3.add("Raju");  
	  
	        // Creating StringJoiner with :(colon) delimiter  
	        StringJoiner sj4 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
	          
	        // Adding values to StringJoiner  
	        sj4.add("Peter");  
	        sj4.add("Raheem");  
	  
	        // Merging two StringJoiner  
	        StringJoiner merge = sj3.merge(sj4);   
	        System.out.println(merge);     

	        
	         

	}

}
