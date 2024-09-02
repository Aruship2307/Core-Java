package com.faq.imp.program;


public class TestSwapNumbers {

	public static void main(String[] args) {

		int a=20, b=10,temp;
		
		// First Approach- by using temp variable
		System.out.println("Before swapping two numbers value: "+a+" "+b);
		temp=a;
		a=b;
		b=temp;
		
		// Second approach: by + and - operator
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping two numbers value: "+a+" "+b);
		
		// Third approach: by * and / operator,,, here a & b shouldn't be zero
		
		a=a*b;   // 200
		b=a/b;  //20
		a=a/b;  //10
	}

}
