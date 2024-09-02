 package com.faq.imp.program;
// get sum of given number digits
import java.util.Scanner;

public class TrialNumDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a given number: ");
        int sum=0;
		int num=sc.nextInt();
		
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Total no of digits: "+sum);
		sc.close();
	}

}
