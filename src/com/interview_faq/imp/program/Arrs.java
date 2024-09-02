package com.faq.imp.program;


class Arrs {
       public static void main (String arg [] ) {
	   int arr []  = new int [4] ;
	   arr[0]=1;
	   arr[1]=2;
	   arr[2]=3;
	   arr[3]=4;
	   
	  System.out.println("Display array elements");
	  
	  for(int i=0;i<arr.length;i++) {
	  System.out.print(arr[i]+" ");
	  }
	}
}