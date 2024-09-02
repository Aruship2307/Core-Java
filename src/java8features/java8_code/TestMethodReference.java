package com.java8features;

import java.util.function.Predicate;

@FunctionalInterface
interface FunctionInter{
	public void show();
}
class Test{
	public static void demo() {
		System.out.println("This is static method invoked by method reference");
	}
}
public class TestMethodReference {

	public static void main(String[] args) {
		
		// method reference code 
		FunctionInter functionInter = Test :: demo;
		functionInter.show();
		
	/*	If no testimplementation is available in existing code base then use following 
		code for lambda expression 
		FunctionInter f =()-> System.out.println("Implementation of sam");
				f.show(); <-- its an abstrac method */

	}

}
