package com.java8features;

// functional interface -- to indicate using annotation (it's optional)
@FunctionalInterface  
interface callable {
	
// default method-- used define method with implementation, we can override default method to provide specific implementation
	
	default void cal(){
		System.out.println("cal() :: default method with default implementation inside Functional Interface block");
	}
	
	// abstract method -- extending class must implement
	
	public void callMore();
	
	// static method -- with implementations
	
	public static void foo() {
		System.out.println("foo() :: static method with implementation inside functional interface");
	}
	
	// methods of the object class
    int hashCode();
    String toString();
    boolean equals(Object obj);
	
}

class Demo implements callable {

	// implementation of abstract method
	@Override
	public void callMore() {
		System.out.println("callMore() :: Implementation of abstract method inside class");
		
	}
	
	// implementation of default method inside class == optional case
	
	@Override
	public void cal(){
		System.out.println("cal() :: Implementation of default method inside class");
	}
	
}
public class TestFIAllMethods {

	public static void main(String[] args) {
		
		// creates the object of demo class & invoke all methods
		
		Demo demo = new Demo();
		
		demo.cal();
		demo.callMore();
		callable.foo();   // by interface name invoke static method
	//	Demo.foo();  static method part of interface not part of implemented classes .. won't compile bcz of static memeber

	}

}
