
package com.faq.imp.program;

import java.util.Scanner;

class Testsc {
       public static void main (String arg []) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your rollno");
	   int rollno= sc.nextInt();
	   
	   System.out.println("Enter your name");
	   String name = sc.next();
	   
	   System.out.println("Enter your fee");
	   double fee = sc.nextDouble();
	   
	   System.out.println(rollno+" "+name+" "+fee);
	   
	   sc.close();
	   }}
	   