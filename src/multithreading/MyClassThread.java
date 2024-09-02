package com.multithreading.prg;

public class MyClassThread extends Thread {

	public void run() {
		for(int i=10;i>=0;i--) {
		System.out.println("value of  i by thread class is: "+i);
		//System.out.println("this is set deamon "+Thread.currentThread().isDeamon());
		try {
			Thread.sleep(200);
		}catch(Exception e) {	
		}
	}
}
	/*
	 * public static void main(String arg[]) { MyClassThread t = new
	 * MyClassThread(); t.start(); }
	 */
}
