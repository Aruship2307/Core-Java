package com.faq.imp.program;

import java.util.Scanner;

public class TrialCountDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a given number: ");
        int count=0;
		int num=sc.nextInt();
		
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("Total no of digits: "+count);
	}

}

// count no of even & odd digits in a given number 
/*
 * int even_num=0, odd_num=0,rem; num=56134; while(num!=0) { rem=num%10; // last
 * digit
 * 
 * if(rem%2==0) { even_num++; } else { odd_num++; } num=num/10;
 * 
 * } System.out.println("Total no of Even number digits: "+even_num);
 * System.out.println("Total no of Odd Number digits: "+odd_num);
 */
