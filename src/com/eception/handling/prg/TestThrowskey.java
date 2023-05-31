package com.eception.handling.prg;

public class TestThrowskey {
	// this throws we used to specify in further program ae exception will ocuur
	public static void main(String[] args) throws ArithmeticException {  
		// TODO Auto-generated method stub
		
		int a=10, b=1,c;
		
		try {
		c=a/b;
		
		System.out.println(+c);
		}catch(ArithmeticException ae) {
			
		}
	    System.out.println("Hii Throws");

	}

}
