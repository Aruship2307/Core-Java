package com.java8features;

@FunctionalInterface
interface Formula{
	double calculate(int a);
	
	
	default double sqrt(int a) {
        return Math.sqrt(positive(a));
    }

    static int positive(int a) {
        return a > 0 ? a : 0;
    }
}

public class CustomFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Formula fobj = new Formula() {   // we have implemented Anonymous Inner class
			@Override
			public double calculate(int a) {
				return sqrt(a*10);
			}
		};
		
		System.out.println(fobj.calculate(10));      //  100.0 of sqrt = 10,,  abstract method in single class 
		System.out.println(fobj.sqrt(16));           // like 23 = print 0.0  , default method calling from ref ,,, sqrt of 16 == 4
		System.out.println(Formula.positive(4));       //-ve = value  0.0, static method +ve = value +ve

//	        Formula formula2 = (a) -> sqrt( a * 100);


	}

}
