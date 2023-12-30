package com.faq.imp.program;
import java.util.*;

public class Pattern12 {
public static void main (String arg []) {
int num=1,i,j,r;
Scanner sc = new Scanner(System.in);
System.out.println("Enter no of rows:");
r=sc.nextInt();
char ch='A';

for( i=1;i<=r;i++) {
      for(j=1;j<=i;j++) {
           if(i%2==0) {
           System.out.print(num+" ");
           num++;
           } 
           else {
           System.out.print(ch+" ");
           ch++;
          }
          }
          System.out.println("");
  }
}}
