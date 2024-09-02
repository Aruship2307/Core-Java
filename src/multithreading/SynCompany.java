package com.multithreading.prg;

public class SynCompany {
	
	int n;
	// inter connect threading betweeen producer and consumer
	
	boolean f = false;
	// f= false .. chance ; producer will run
	// f= true .. chance ; consumer will run
	
	
	// prducers action ..synchronized to do one process
	synchronized public void product_items(int n) throws InterruptedException {
		if(f) {
				wait();
		    }
		this.n=n;
		System.out.println("produced item is: "+this.n);
		f=true;
		notify();
	}
	
	//// consumers action ..synchronized to do one process
	synchronized public int consume_items() throws InterruptedException {
		if(!f) {
			wait();
		    }
		System.out.println("consumed item is: "+this.n);
		f=false;
		notify();
		return this.n;
	}

}
