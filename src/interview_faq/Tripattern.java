package com.faq.imp.program;


public class Tripattern {
       public static void main (String arg [] ) {
    	   
       int i,j,k;

          for(i=1;i<=5;i++) {
                k=i;
           for(j=1;j<=i;j++) {
                System.out.print(k+" ");
                k++;
            }
           System.out.println("");
           }
      }
}