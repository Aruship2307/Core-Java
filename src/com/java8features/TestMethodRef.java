package com.java8features;

interface InterFI {
	public void m1();
}

public class TestMethodRef {
	
	public static void m2() {
		System.out.println("Implementation by method reference");
	}

	public static void main(String[] args) {

		InterFI i = TestMethodRef :: m2;
		i.m1();                         // FI of m1() method internally refer to m2() method
	}

}


/*method reference condition 
1. method argument must be same 
2. method name , access moifier & return type is differen accepted*/