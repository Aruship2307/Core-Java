package com.java8features;

public class RunnableDemo {

	public static void main(String[] args) {

		System.out.println("Runnable Test with different ways :\n ");
		
		// Anonymous class Runnable 
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runable invoked by Anonymoua inner class");
			}
		};
		
		// invoke runnable by lambda 
		
		Runnable r2 = () -> System.out.println("Runnable invoked by lambda function");
		
		// lambda Runnable with block 
		
		Runnable r3 = () ->{
		             int i;
		             for(i=0;i<3;i++) {
		            	 System.out.println("Runnable invoked by block");
		             }
		};
		
		r1.run();
		r2.run();
		r3.run();
		r3.run(); // debug this code by calling r3.run(), play around the code 
	}

}
