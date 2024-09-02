package com.java8features;

interface Operation {
	int apply(int a, int b);
}

class Logic {
	public static int operation(int a, int b, Operation operation) {
		return operation.apply(a,b);
	}
}

public class TestLambda22 {

	public static void main(String[] args) {
      
		int sum = Logic.operation(4, 6, (int a, int b) -> a+b);
		int mul = Logic.operation(5, 10,(int a, int b) -> a*b);
		System.out.println("sum & mul operations by logic class: "+sum+" "+mul);
		
	  
		// further modifications on above code  ( removed Logic class)
		
		Operation op = (a,b) ->(a+b);
		Operation op1 = (a,b) ->(a*b);
		System.out.println("Sum by lambda expressions: "+op.apply(10, 25) + "Mul by lambda expressions: "+ op1.apply(5, 5));
		
	}

}
