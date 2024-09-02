package com.faq.imp.program;
import java.util.*;

class Tricheckall {
         public static void main (String arg [] ) {
        	 
         Scanner s = new Scanner(System.in);
         
           int a = s.nextInt();
           int b = s.nextInt();
           int c = s.nextInt();


      if(a==b &&b==c ) {
          System.out.println("Equilateral Triangle");
       }else if (a==b || b==c || a==c) {
    	   System.out.println("Isosceles Triangle");
       }else {
    	   System.out.println("Isocalene Triangle");
       }
    } 
}