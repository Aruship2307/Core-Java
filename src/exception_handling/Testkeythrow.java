package com.eception.handling.prg;

public class Testkeythrow {

	public static void main(String[] args) {

		int a=10,b=20,c;
		
		try {
			c=a*b;
			if(100>=c)
			{
//it creates the exce object & handle it into catch block or explicitely, create ex obj hand it to jvm
			throw new ArithmeticException();  
			}
			System.out.println("value of c"+ c);	
		}
		catch(ArithmeticException ae) {	
		}
		System.out.println("Throw keyword");
	}

}
