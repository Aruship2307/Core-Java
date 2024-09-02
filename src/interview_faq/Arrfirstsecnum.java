package com.faq.imp.program;

import java.util.*;
public class Arrfirstsecnum {
       public static void main (String arg [] ) {
	   Scanner sc = new Scanner(System.in);
	   int i,large,sec_large;
	   System.out.println("Enter array size");
	   int n = sc.nextInt();
	   int arr []  = new int [n] ;
	   
	  System.out.println("Enter array elements");
	  for( i=0;i<arr.length;i++) {
	  arr[i]= sc.nextInt();
	  }
	  System.out.println("Display array elements");
	  for( i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
	  }
	  
	  large=arr[0];
	  sec_large=arr[1];
	  
	  for(i=0;i<arr.length;i++) {
	  if(arr[i] > large) {
	  sec_large=large;
	  large=arr[i];
	  }
	  else if (sec_large < arr[i] && large > arr[i]) {
	  sec_large=arr[i];
	  }
                  }
	  System.out.println("\nLargest element: "+ large+" Second largest element: "+sec_large);
	  }}