package com.faq.imp.program;
public class Patternsmix {
       public static void main (String arg [] ) {
       int i,j,k;

       for(i=1;i<=5;i++) {
          for(j=i;j>1;j--) {
             System.out.print(j+" ");
           }
           for(j=1;j<=(5-i+1);j++) {
             System.out.print(j+" ");
           }
           System.out.println("");
           }
       }
}
              