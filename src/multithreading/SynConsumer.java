package com.multithreading.prg;

public class SynConsumer extends Thread {
	
	SynCompany sc ;
	SynConsumer(SynCompany sc) {
		this.sc=sc;
	}
	
	public void run() {
		while(true) {
			try {
				this.sc.consume_items();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {Thread.sleep(1000);}catch(Exception e){}
		}
	}

}
