package com.faq.imp.program;
// find the missing number from array, array should be in range.
public class TestMissingArrNumber {

	public static void main(String[] args) {

		int arr[]=new int [] {1,2,3,5,6,7,8,9,10};
		
		// sum of first 10 numbers=n*(n+1)/2
		int sum = 10*(10+1)/2;
		//System.out.println(sum);
		
		int actulSum=0;
		
		for(int i=0;i<arr.length;i++) {
			actulSum=actulSum+arr[i];
		}
		
		System.out.println("Missing number is: "+(sum-actulSum));
	}

}
