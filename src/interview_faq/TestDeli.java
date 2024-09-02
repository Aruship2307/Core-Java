package com.faq.imp.program;
import java.util.Scanner;

class TestDeli {
       public static void main (String arg []) {
	  // String input = "10 10 tea 20 coffee 30 tea biscuits";
                  String input = "10 10 tea 20 coffee 30 tea biscuits";
	   Scanner sc = new Scanner(input).useDelimiter("\\s");

			   System.out.println(sc.nextInt());
               System.out.println(sc.nextInt());
			   System.out.println(sc.next());
			   System.out.println(sc.nextInt());
			   
	   sc.close();
	   }}
	   