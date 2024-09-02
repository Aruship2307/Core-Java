package com.faq.imp.program;

import java.util.Scanner;

public class TestRevrsNumber {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter a given number:");
     int num = sc.nextInt();
     
     
     // first approach to solve this 
     int rev = 0;
     
     while(num!=0) {
    	 rev = rev*10 + num%10;
    	 num = num/10;
     }
     System.out.println("Reverse number is by normal:"+rev);

     // second approach by StringBuffer class
     
     StringBuffer sb = new StringBuffer(String.valueOf(rev));
     StringBuffer rev2 = sb.reverse();
     
     System.out.println("Reverse number is by StringBuffer:"+rev2);
     
     // second approach by StringBuilder class
     StringBuilder sb1 = new StringBuilder();
     sb1.append(rev2);
     StringBuilder rev3 = sb1.reverse();
     
     System.out.println("Reverse number is by StringBuffer:"+rev3);
     }

}
