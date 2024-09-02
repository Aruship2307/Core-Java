package com.java8features;

import java.util.StringJoiner;

public class StringJoiner8Methods2 {

	public static void main(String[] args) {
		 StringJoiner joinNames = new StringJoiner(",","[","]"); // passing comma(,) & square-bracket [] as delimiter   
         
	        // Prints nothing because it is empty  & display empty [] square-bracket
	        System.out.println(joinNames);  
	          
	        // We can set default empty value.  
	        joinNames.setEmptyValue("It is empty");  
	        System.out.println(joinNames);  
	          
	          
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	        System.out.println(joinNames);  
	          
	        // Returns length of StringJoiner  
	        int length = joinNames.length();  
	        System.out.println("Length: "+length);  
	          
	        // Returns StringJoiner as String type   
	        String str = joinNames.toString();  
	        System.out.println(str);  
	          
	        // Now, we can apply String methods on it  
	        char ch = str.charAt(3);  
	        System.out.println("Character at index 3: "+ch);  
	          
	        // Adding one more element   
	        joinNames.add("Sourabh");  
	        System.out.println(joinNames);  
	          
	        // Returns length  
	        int newLength = joinNames.length();  
	        System.out.println("New Length: "+newLength);  
	        
	        // merge two string joiner
	        System.out.println("Merge above two strings");
	        
	        StringJoiner joinNames2 = new StringJoiner(",","[","]");
	        
	        joinNames2.add("Ashish");
	        joinNames2.add("Amol");
	        joinNames2.add("Avinash");
	        
	        StringJoiner merge = joinNames.merge(joinNames2);
	        
	        System.out.println(merge);
	        
	        
	    
	}

}
