package com.java8features;

import java.util.TreeMap;

public class TreeMapTestByLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pass lambda while creating object & sort by key 
		TreeMap<Integer,String> t = new TreeMap<>((a,b)->(a>b)?1:(a<b)?-1:0);

		t.put(23, "Rushi");
		t.put(8, "vaibhav");
		t.put(6, "pavan");
		t.put(28, "shruti");
		t.put(21, "suvi");
		
		System.out.println(t);
	}

}
