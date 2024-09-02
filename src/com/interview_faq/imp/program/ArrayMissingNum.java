package com.faq.imp.program;
/*Array Missing number has below rules:
	number should not be duplicate 
	number should be in range
	Array no need to be in sorted order*/
	
public class ArrayMissingNum {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,7,8,9}; // check 6 missing number
		int sum1=0,sum2=0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];  // 45
		}
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;  //39  
		}
		System.out.println("Missing number is: "+(sum2-sum1));
		
	}

}
