package com.faq.imp.program;
import java.util.*;


public class Arrinsertnewnum{
         public static void main(String arg [] ) {
        	 
         Scanner sc = new Scanner (System.in);
         int n,i=0,pos,num;
         
         System.out.println("Enter array size:");
         n=sc.nextInt();
         int arr[] = new int [n] ;
         System.out.println("Enter array elements:");
       
         for(i=0;i<n;i++)
         {
           arr[i] =sc.nextInt();
         }
        System.out.println("Display array elements:");
        
        for(i=0;i<n;i++)
        {
        System.out.print(arr[i] +" ");
        }
        
        System.out.println("\nEnter any number to add in array:");
        num = sc.nextInt();
        System.out.println("Enter position where you want to insert element:");
        pos = sc.nextInt();

        for(i=n-1 ; i>=pos;i++)
        {
        arr[i+1] = arr[i] ;
        n++;
        arr[pos] = num;
        }
        
        System.out.println("After adding new element in array:");
        
        for(i=0;i<=n;i++)
        {
        System.out.print(arr[i] +" ");
        }

}
}
