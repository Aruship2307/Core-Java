package com.java8features;

import java.util.function.Consumer;

class ConsumerClass implements Consumer<String>{
	
	@Override
	public void accept(String t) {
      System.out.println("Inside Consumer class: "+t);
	}
}
public class CustomConsumerFITest {

	public static void main(String[] args) {
		ConsumerClass c = new ConsumerClass();
		c.accept("SoftwareEngineer");

	}

}
