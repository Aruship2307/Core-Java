package com.faq.imp.program;
import java.util.*;

class Arrminmax {
       public static void main (String arg [] ) {
	   Scanner sc = new Scanner(System.in);
	   int i,j,temp;
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
	  
	  int min=arr[0];
	  int max=arr[0];
	  
	  for(i=1;i<arr.length;i++) {
	  if(max<arr[i]) {
                  max=arr[i];
	  }
	  
	  if (min > arr[i]) {
                  min=arr[i];
	  }
	 }
	  
       System.out.println("\nMinimum element: "+ min+" Maximum element: "+ max);
	  }
 }