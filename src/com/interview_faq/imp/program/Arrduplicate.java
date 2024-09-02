package com.faq.imp.program;

import java.util.*;
public class Arrduplicate {
			public static void main(String arg [] ) {
			Scanner s = new Scanner(System.in);
			int n,i,k,j,flag=1;
			System.out.println("Enter array size: ");
			n=s.nextInt();
			int arr[] = new int [n];
			System.out.println("Enter array elements:");
			for(i=0;i<n;i++) {
			arr[i] = s.nextInt();
			}
				System.out.println("Display array elements:");
			for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			}
			for(i=0;i<n;i++) {
			    for(j=i+1;j<n;j++) {
				if(arr[i] == arr[j])
				System.out.println("\nDuplicate number: "+arr[j]);
				}
			}
            }
}	