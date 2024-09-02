package com.faq.imp.program;

class Patternabmix { 
      public static void main (String arg []) {
	  int i=1,j;
	  char ch='A',c='A';
	  
	       for(i=1;i<=4;i++) {
	                 for(j=1;j<=i;j++) {
		  System.out.print(ch+" ");
		  ch++;
		  }
		  System.out.println("");
		  }
           for(i=1;i<4;i++) {
              for(j=4-i;j>=1;j--) {
                System.out.print(c+" ");
                c++;
               }
              System.out.println("");
		  }
                              
}}