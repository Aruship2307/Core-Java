package com.faq.imp.program;

public class TestDemo {

	public static void main(String[] args) {
    String str = "developer", rev="";
    System.out.println("given string is: "+str);
    
    // first approach using string +concatenete operator
    for(int i=str.length()-1;i>=0;i--) {
    	rev=rev+str.charAt(i);
    }
    System.out.println("Reversed string is: "+rev);
	}
}

/*
 *  Map<String, Integer> hashMap = new HashMap<>();
	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        
	        for(Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	        	System.out.println(entry.getKey() + entry.getValue());
	        }*/
