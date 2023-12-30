package com.faq.imp.program;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n, sum=0,x,rem;
	    System.out.println("Enter a number");
	    n=sc.nextInt();
	    x=n;
	    while(x!=0){
	        rem=x%10;
	        sum=sum+(rem*rem*rem);
	         x=x/10;
	    }if(n==sum){
	        		System.out.println("Armostrong number");
	    } else {
	        		System.out.println("Not Armostrong number");
	    }
	    sc.close();
	}

}
