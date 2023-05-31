package com.faq.imp.program;

public class CheckArrOddEven {

	public static void main(String[] args) {

		int arr[]= {5,8,7,2,9,4};
		System.out.println("Even number: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
			
		}
		
		System.out.println("Odd number: ");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
		

}
