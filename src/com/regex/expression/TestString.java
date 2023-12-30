package com.regex.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {

	public static void main(String[] args) {
		
		// Define a pattern to be searched 
		Pattern pattern = Pattern.compile("amg");
		
		// search above pattern in bewlo matchesr
		
		Matcher matcher = pattern.matcher("cloudamg.com");
		
		// print from start & end positiom of pattern found 
		
		while(matcher.find()) {
			System.out.println("Pattern found position: "+matcher.start()+" to "+matcher.end());
		   }
		
		// 
		//1st way  
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("as");  
		boolean b = m.matches();  
		  
		//2nd way  
		boolean b2=Pattern.compile(".s").matcher("as").matches();  
		  
		//3rd way  
		boolean b3 = Pattern.matches(".s", "as");  
		  
		System.out.println(b+" "+b2+" "+b3);  
		
		
		System.out.println("Regular expression example");
		// checking as per position wise true or false given char
		System.out.println(Pattern.matches(".s", "as"));   //true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));   //false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));  //false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));  //false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));  //true (3rd char is s)  
		
		System.out.println("character classes example ");
		// character classes example 
		System.out.println(Pattern.matches("[amn]", "abcd"));    //false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));       //true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));  //false (m and a comes more than once) 
		System.out.println(Pattern.matches("[^amn]", "x"));      // true x is expect or negate of a,b,c
		System.out.println(Pattern.matches("[A-Z]", "X"));        // true range inclusive 
		System.out.println(Pattern.matches("[a-zA-Z]", "p"));     // true
		System.out.println(Pattern.matches("[a-zA-Z]", "XuT"));   // false
		System.out.println(Pattern.matches("[a-d[m-p]]", "q"));   // false 	a through d, or m through p: [a-dm-p] (union)
		System.out.println(Pattern.matches("[a-z&&[def]]", "e"));   //true,,  d, e f Intersection, checking and conditions
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));   // false ,, a through z, except for b and c: [ad-z] (subtraction)
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "p"));  //false	a through z, and not m through p: [a-lq-z](subtraction), mnop=false
		
		
		}
	}