package com.faq.imp.program;


import java.util.*;
class Arrsort2 {
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
                  
	  System.out.println("\nNew array after sorting");
	  
	  for(i=0;i<arr.length;i++) {
	      for(j=i+1;j<arr.length;j++) {
	           if(arr[i]>arr[j]) {
	               temp=arr[i];
	               arr[i]=arr[j];
	               arr[j]=temp;
	            }
	    }
	      
	  System.out.print(arr[i]+" ");
	  }
  }
}