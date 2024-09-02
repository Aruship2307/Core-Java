package com.faq.imp.program;
import java.util.*;	

class Ctwobj {
      public static void main (String arg[]) {
	  ArrayList<String> al = new ArrayList<String>();
                  ArrayList<String> al2 = new ArrayList<String>();
	  al.add("Rushi");
	  al.add("Avi");
	  al2.add("Sai");
	  al2.add("radhe");
	  al.addAll(al2);
	  for(String obj:al2) {
	 
	  System.out.println(obj);
	  }
	  }}