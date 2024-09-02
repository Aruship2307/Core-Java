package com.faq.imp.program;

import java.util.Arrays;

public class DemoArraysSort {

	public static void main(String[] args) {

		int a [] = {20,51,38,42,28,46};
		
		// Approach first -- by Arrays.paralalelSort() method
		System.out.println("Arrays before sorting the elements: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays After sorting the elements: "+Arrays.toString(a));
		
		// Approach first -- by Arrays.Sort() method
		System.out.println("Arrays before sorting the elements: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrays After sorting the elements: "+Arrays.toString(a));

	}

}
