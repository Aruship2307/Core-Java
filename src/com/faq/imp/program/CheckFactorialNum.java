package com.faq.imp.program;

import java.util.Scanner;

// factorial num 5! = 5*4*3*2*1 = 120  <<== product of all descending order numbers 
public class CheckFactorialNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,fact=1;  
		System.out.println("Enter a number to check prime or not: ");
		  int number = sc.nextInt();//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		
	}

}
