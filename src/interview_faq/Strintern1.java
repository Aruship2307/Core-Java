package com.faq.imp.program;

public class Strintern1 {
	  public static void main (String arg [] ) {
	  String s ="Hello";
	  String s1="java";
	  s1=s.intern();
	  System.out.println(s);
	  System.out.println(s1); // we have assign the value to s1 after intern
      System.out.println(s.intern());  // print hello bcaz wehaven't assign to any value.
      }
}