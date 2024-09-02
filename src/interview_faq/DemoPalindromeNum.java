package com.faq.imp.program;

import java.util.Scanner;

public class DemoPalindromeNum {

	public static void main(String[] args) {

	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter a given number:");
	     int num = sc.nextInt();
	     int pal_num=num;
	     
	     // to check whether given number palindrome or not
	     int rev = 0;
	     
	     while(num!=0) {
	    	 rev = rev*10 + num%10;
	    	 num = num/10;
	     }
	     if(rev==pal_num)
	     System.out.println("Given Number is Palindrome:"+pal_num);
	     else
		     System.out.println("Given Number is Not Palindrome:"+pal_num);
	     
	}

}
