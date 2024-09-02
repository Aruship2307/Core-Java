package com.faq.imp.program;

import java.util.Arrays;

public class TestArrayEqual {

	public static void main(String[] args) {
 
		/* first approach by Arrays.equals() method
		 * int a [] = {1,2,3,4,5}; int b [] = {1,2,3,4,5};
		 * 
		 * boolean status = Arrays.equals(a, b);
		 * 
		 * if(status==true) System.out.println("Arrays are equal"); else
		 * System.out.println("Array are not equal");
		 */
		
		int a [] = {1,2,3,4,5};
		int b [] = {1,2,3,4,5};
		
		int a_len = a.length, b_len=b.length;
		
		if(a_len==b_len)
			System.out.println("Arrays are equal");
		else
			System.out.println("Array are not equal");
	}

}
