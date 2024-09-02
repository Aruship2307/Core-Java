package com.faq.imp.program;
import java.util.*;

class Threenumnestif {
	
      public static void main (String arg [] ) {
    	  
     Scanner s = new Scanner(System.in);
     System.out.println("Enter any three number: ");
     int a = s.nextInt();
     int b = s.nextInt();
     int c = s.nextInt();

        if(a>b) {
            if(a>c) {
               System.out.println(a+" is greater");
             }else {
                System.out.println(c+ " is greater");
            }
           }else
              if(b>c) {
                System.out.println(b+ " is greater");
            } else {
               System.out.println(c+ " is greater");
            }
        s.close();
    }
}