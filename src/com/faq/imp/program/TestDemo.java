package com.faq.imp.program;

import java.util.HashMap;
import java.util.Map;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        
	        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	        	System.out.println(entry.getKey() + entry.getValue());
	        }

	}

}
