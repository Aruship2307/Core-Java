package com.multithreading.prg;

public class SynMainMethod {

	public static void main(String[] args) {

		SynCompany sc1 = new SynCompany();
		SynProduce sp = new SynProduce(sc1);
		SynConsumer scr = new SynConsumer(sc1);
		sp.start();
		scr.start();
	}

}
