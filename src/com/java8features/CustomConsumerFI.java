package com.java8features;
// edit class as per accept and othe methods 
@FunctionalInterface
interface Check {
	public void check(int a, int b);
}
public class CustomConsumerFI implements Check{
	
	@Override
	public void check(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		Check c = new CustomConsumerFI();
	    c.check(10, 20);
	}

}
