package com.faq.imp.program;

import java.util.Scanner;

class Testadds {
       public static void main (String arg []) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter any case no");
                 
	  int n=sc.nextInt();
	   int m1,m2,n1,n2,a,b;
	   switch(n) 
                   {
	   case 1: 
                
	           System.out.println("Enter two numbers");
			   n1=sc.nextInt();
			   n2=sc.nextInt();
			   a=n1+n2;
			   System.out.println("Addition is="+a);
			   break;
			   
		case 2 : 
		         
                                
		        System.out.println("Enter two numbers");
				  m1=sc.nextInt();
			   m2=sc.nextInt();
			   b=m1-m2;
			   System.out.println("Substraction is="+b);
				break;
            
			   
        default : 
                  
                   System.out.println("This is default method");
                    break;
             
               }		
	   sc.close();
	   }}
	   