package com.multithreading.prg;

public class SynProduce extends Thread{
	SynCompany sc ;
	public SynProduce(SynCompany sc) {
		this.sc=sc;
	}
	
	public void run() {
		int i=1;
		while(true) {
			try {
				this.sc.product_items(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {Thread.sleep(3000);}catch(Exception e){}
			i++;
		}
	}
}
