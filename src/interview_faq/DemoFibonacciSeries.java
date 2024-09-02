package com.faq.imp.program;
// fib series is,, 0 1   1 2 3 5 8 13 21 34    (previous two number addition)

public class DemoFibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1, sum=0; // n1 & n2first two numbers in fobonacci series 

		System.out.println(n1+"\n"+n2);
		
		for(int i=2;i<10;i++) {
			sum=n1+n2;   // add 2 num to get third value
			System.out.println(sum);
            n1=n2;
            n2=sum;
		}
	}

}
