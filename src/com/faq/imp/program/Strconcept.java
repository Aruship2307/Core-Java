package com.faq.imp.program;

class Strconcept {
      public static void main (String arg []) {
	  String s1="String pool";
	  String s2="String pool";
	  String s3 = new String("String pool");
	  
	  System.out.println(s1.equals(s2));
	  //System.out.println(s1.equals(s3));
	  if(s1==s2)
	  System.out.println("True");
	  else
	  System.out.println("False");
	  }}