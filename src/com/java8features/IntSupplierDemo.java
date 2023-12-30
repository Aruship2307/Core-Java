package com.java8features;

import java.util.function.IntSupplier;

public class IntSupplierDemo {

	public static void main(String[] args) {

		IntSupplier s = ()->(int)(Math.random()*10);
		
		String otp ="";
		
		for(int i=0;i<6;i++) {
            // method getAsInt which can always takes primitive types as input and return primitive types
			otp=otp+s.getAsInt();
		}
		
		System.out.println("The 6 digit OTP: "+otp);
	}

}
