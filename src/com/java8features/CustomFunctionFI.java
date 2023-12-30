package com.java8features;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
}

public class CustomFunctionFI {

	public static void main(String[] args) {
		
   // first appraoch to invoke method by an Anonymous inner class		
    FunctionImpl functionImpl = new FunctionImpl();
    System.out.println("call by Anonymous Inner class Length: "+functionImpl.apply("Rushikesh"));
    
    // second approach to call the method by lambda call 
    Function<String, Integer> lengthFunction = s -> s.length();
    
    int length = lengthFunction.apply("RushikeshPanchal");
    System.out.println("Call by Lambda of Length: " + length);
    
    // third approach to invoke the method by method references ::
    System.out.println("call by method ref of length: "+functionImpl.apply("Panchal"));
    
	}

}
