package com.regex.expression;

import java.util.regex.Pattern;

public class TestRegQuantifiesMethods {

	public static void main(String[] args) {
		
		System.out.println("? quantifier ....");  
		System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
		System.out.println(Pattern.matches("[amn]?", "aa"));//false (a or m or n comes more than one time) 
		System.out.println(Pattern.matches("[amn]?", "aaammmnnn"));//false (a or m or n comes more than one time) 
		
		System.out.println("+ quantifier ....");  
		System.out.println(Pattern.matches("[amn]+", "a"));//true (a or m or n once or more times)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aaRSMnn"));//false (RS n)
		
		System.out.println("* quantifier ....");  
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
		
		System.out.println(Pattern.matches("[amn]", "a{n}"));//true (a or m or n may occurs n times only)  a{n,} n occurs n times or more than n times
		System.out.println(Pattern.matches("[amn]", "a{y,z}"));  //false 	X occurs at least y times but less than z times
	}

}
