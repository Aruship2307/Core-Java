package com.faq.imp.program;

public class TestRevString {

	public static void main(String[] args) {

     // first approach using + (concatenation operator)
		String str = "ABCD";
		String rev = "";
		
		int len = str.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reversed String is: "+rev);
	}

}
