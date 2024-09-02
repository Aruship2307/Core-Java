package com.faq.imp.program;

import java.util.Scanner;
public class Arotateright {

public static void arightrotate (int arr[],int n,int r) {
int temp,j,i;

for(j=1;j<=r;j++) {
temp = arr[n-1];
for(i=n-1;i>=1;i--) {
arr[i] = arr[i-1];
}
arr[i] = temp;
}
System.out.println("Array after right rotate: " + r);
for(i=0;i<n;i++) {
System.out.print(arr[i]+" ");
}
}

public static void main (String arg []) {
Scanner s = new Scanner (System.in);
int n,r,i;
System.out.println("Enter array size: ");
n=s.nextInt();

int arr[] = new int[n];
System.out.println("Enter array elements: ");
for(i=0;i<n;i++) {
arr[i] = s.nextInt();
}
System.out.println("Enter no of right rotation:");
r=s.nextInt();
arightrotate (arr,n,r);
}
}