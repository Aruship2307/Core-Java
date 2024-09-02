package com.java8features;

public class LambdaAnonymInner {

	public static void main(String[] args) {
       
		
		Runnable r = () -> {
			for(int i=0;i<=10;i++){
				System.out.println("Child Thread");
			}
			};
				Thread t = new Thread();
			t.start();
			for(int i=0;i<=10;i++){
				System.out.println("Main Thread");
			}
		}
		
	}


/*I am writing class that implement  runnable interface
in that class implement of run methof
for that implemented class created object of Runnable*/