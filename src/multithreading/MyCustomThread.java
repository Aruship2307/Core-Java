package com.multithreading.prg;

public class MyCustomThread implements Runnable {

	public void run() {
		// for task thread 
		for(int i=1;i<=10;i++) {
			System.out.println("value of i by Runnable Interface implements is:"+i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		// creatte obj of myThread
		
		MyCustomThread t1 = new MyCustomThread();

		Thread th = new Thread(t1);
		
		//th.start();
		
		MyClassThread t = new MyClassThread(); 
		//t.setDaemon(true);
		th.start();
		t.start();
	}

}

