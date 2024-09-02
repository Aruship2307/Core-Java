package com.faq.imp.program;

public class DivisiblendEvenNum {

	public static void main(String[] args) {
		  // Print last 10 even numbers which is divisible by 3 between 10 to 100
		   // i-=2 i.e for even numbers
		  int count = 0;
		        for (int i = 100; i >= 10; i -= 2) {
		            if (i % 3 == 0) {
		                System.out.println(i);
		                count++;
		            }
		            if (count == 10) {
		                break;
		            }
		        }
	}

}
