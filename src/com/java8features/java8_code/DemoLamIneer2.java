package com.java8features;

@FunctionalInterface
interface Interf1 {
	public void m1();
}
public class  DemoLamIneer2 {
	int x = 20;
	public void m2() {
		int y =28; // this local var within lambda expn is final variable 
		Interf1 i = () -> {
			System.out.println("outer class variable"+x);
			System.out.println("Inner class variable"+y);
			// int x=38;-- no error class instance var can declare
			// int y-90 -- compile time error can't instantiate local var inside lambda expression
		};
		i.m1();
	}
	public static void main(String[] args) {
		DemoLamIneer2 t = new DemoLamIneer2();
		t.m2(); 
	}

}
