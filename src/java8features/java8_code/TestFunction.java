package com.java8features;
import java.util.function.*;

public class TestFunction {

	public static void main(String[] args) {
        
		
		// default methods in function 
		Function<String,String> f1 = s->s.toUpperCase();
		Function<String,String> f2 = s->s.substring(0, 9);
		
		System.out.println("the result of f1 apply: "+f1.apply("midlevelcompany"));
		System.out.println("the result of f2 apply: "+f1.apply("midlevelcompany"));
		
		System.out.println("the result of f1 and then f2: "+f1.andThen(f2).apply("midlevelcompany"));
		System.out.println("the result of f1 and then f2: "+f1.compose(f2).apply("midlevelcompany"));
		
		// static method belongs to Function-- Function.identity()
		// it return a function that always returns its input argument 
		Function<String,String> f = Function.identity();
		
		String s = f.apply("BankingIT");
		
		System.out.println("Returns same as input argument identity(): "+s);
	}

}
