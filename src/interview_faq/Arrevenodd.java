package com.faq.imp.program;
import java.util.*;
import java.util.Arrays;
public class Arrevenodd {
       public static void main (String arg []) {
    	   Scanner s = new Scanner(System.in);
    	   int i,j,n, temp;
    	   System.out.println("Enter array size:");
    	   n=s.nextInt();
    	   int arr[] = new int [n];
    	   System.out.println("Enter array elements");
    	   for(i=0;i<arr.length;i++) {
    		   arr[i] = s.nextInt();
    	   }
    	   System.out.println("Display array elements");
    	   for(i=0;i<arr.length;i++) {
    		   System.out.print(arr[i]+" ");
    	   }
    	   i=0;
    	   j=n-1;
    	   while(i<j) {
    		   while(arr[i]%2==0) {
    			   i++;
    		   }
    		   while(arr[j]%2!=0) {
    			   j--;
    		   }
    		   if(i<j) {
    		   temp=arr[i];
    		   arr[i]=arr[j];
    		   arr[j]=temp;
    		   i++;
    		   j--;
    		   }
    	   }
    	   System.out.println("\nArray after arranging even followed by odd numbers: ");
    	   for(i=0;i<arr.length;i++) {
    		   System.out.print(arr[i]+" ");
    	   }
       }}

/* write this logic for JAVA prg
Algorithm: segregateEvenOdd()
1) Initialize two index variables left (++) and right index decrement (--):  
            left = 0,  right = size -1 
2) Keep incrementing left index until we see an even number.
3) Keep decrementing right index until we see an odd number.
4) If left < right then swap arr[left] and arr[right]*/
