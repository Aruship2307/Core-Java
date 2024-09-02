package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class CustomFunctionInter implements Function<String, Integer>{
	@Override
	public Integer apply(String t) {
		return null;
	}

	public static void main(String[] args) {

		Function<String,Integer> p = new CustomFunctionInter();
		
		System.out.println(p);
	}

	

}
