package com.faq.imp.program;

import java.util.*;

public class Arrht {
            public static void main (String arg [] ) {
            Scanner sc = new Scanner(System.in);
            int [] a = new int [sc.nextInt()];

           for(int i=0; i<a.length; i++) {
          a[i] = sc.nextInt();
          }

         for(int i=0; i<a.length; i++) {
         if(a[i]==i+1) 
         {}
         else
         System.out.println(i);
         }}}