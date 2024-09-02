package com.faq.imp.program;

public class FinalDemo {

	public static void main(String[] args) {
		final int i;
        i = 20;
        int j = i+20;
       // i = j+30;  // compile time erro 
        System.out.println(i + " " + j);
	}

}
