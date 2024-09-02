package com.java8features;

public class StringJoinesWays {

	public static void main(String[] args) {

		// Using the concatenation operator (+):
		
		String s1 = "Java";
		String s2 = "Programming";
		String result = s1 + " " + s2; // "Java Programming"
		
		System.out.println(result);

		// Using the concat() method:

		String s3 = "Hello";
		String s4 = "World";
		String res = s3.concat(" ").concat(s4); // "Hello World"
		
		System.out.println(res);
		
		// Using the StringBuilder class:

        String s5 = "REST";
        String s6 = "API";
        
        StringBuilder sb = new StringBuilder();
        sb.append(s5).append(" ").append(s6);
        String sb_res = sb.toString();
        
        System.out.println(sb_res);
        
        
        // Using the StringBuffer class:
        String s7 = "Software";
        String s8 = "Engineer";
        StringBuffer sbr = new StringBuffer();
        sbr.append(s7).append(" ").append(s8);
        String sbr_res = sbr.toString(); // "Software Engineer"
        
        System.out.println(sbr_res);
        
        
        // Java 1.8 = Using the String.join() method 
        String s9 = "Hello";
        String s10 = "World";
        String str_joiner = String.join(" ", s9, s10); // "Hello World"
        
        System.out.println(str_joiner);




	}

}
