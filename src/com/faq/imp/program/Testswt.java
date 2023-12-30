package com.faq.imp.program;
import java.util.Scanner;

class Testswt {
       public static void main (String arg []) {
    	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter any case no");
                 
	  int n=sc.nextInt();
	   switch(n){
	   case 1: 
             System.out.println("one");
	          break;   
		case 2 : 
		    System.out.println("Two");
		    break;   
        default : 
             System.out.println("Three");
              break;
              }		
	   sc.close();
	   }
  }
	   