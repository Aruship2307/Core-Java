package com.java8features;

@FunctionalInterface
interface Calculator{
	int compute(int x);
}

@FunctionalInterface
interface StrTest {
    void CheckCode();
}

class FITest implements Calculator, StrTest{

	@Override
	public int compute(int x) {
		return 0;
	}
	
	 @Override
	    public void CheckCode() {
	        System.out.println("Checking code...");
	    }
	
}

public class FIbyLambda {

	public static void main(String[] args) {

    Calculator c = (x)->x*x;   // (int x) -> x*x; 
    int result = c.compute(4);
    System.out.println("Multiplication: "+result);
    
    
    StrTest st = ()->System.out.println("Checking and Optimiing code in Java 8");
    st.CheckCode();
    
	}

}
