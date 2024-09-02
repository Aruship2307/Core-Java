package com.faq.imp.program;


import java.util.*;  
class Twodarrswapdiagonal { 
      public static void main (String arg []) {
	  int i=0,j=0,n1,n2,temp;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter no of rows&columns (N1xN2):");
	  n1=s.nextInt();
	  n2=s.nextInt();
	  int arr[][] = new int [n1][n2];
	  System.out.println("Enter array elements for matrix (N1xN2):");
	  
	  for(i=0;i<n1;i++) {
	      for(j=0;j<n2;j++) {
		  arr[i][j] = s.nextInt();
		  }
		}
	  
		  // Display original array 
		  System.out.println("Display array elements for matrix (N1xN2):");
		  for(i=0;i<n1;i++) {
	           for(j=0;j<n2;j++) {
		          System.out.print(arr[i][j]+" ");
		          }
		          System.out.println("");
		     }
		  
		  
              // Swapping array diagonal elements 
		  for(i=0;i<n1;i++) {
		  //i=j;
		  temp = arr[i][i];
		  arr[i][i] = arr[i][n1-i-1];
		  arr[i][n1-i-1]=temp;
		  }
		  
		  
		  // printing array after diagonal exchange
		  System.out.println("Array after exchanging the diagonal elements:");
		  for(i=0;i<n1;i++) {
		     for(j=0;j<n2;j++) {
			 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println("");
			 }
    }
}


