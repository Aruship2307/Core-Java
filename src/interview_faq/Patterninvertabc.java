package com.faq.imp.program;


class Patterninvertabc {
         public static void main (String arg []){
         char ch= 'A' ;
         int i,r,j;
        for(i=1; i<=5; i++) {
        for(j=5; j>=i; j--) {
        System.out.print(ch+" ");
        ch++;
        }
        System.out.println();
        }
        }
}