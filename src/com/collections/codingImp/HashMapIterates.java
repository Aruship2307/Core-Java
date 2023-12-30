package com.collections.codingImp;


import java.util.*;
public class HashMapIterates
{
	public static void main(String[] args) {
	   
	   HashMap<Integer, String> map = new HashMap<>();
	   map.put(1,"java");
	   map.put(2,"sql");
	   map.put(3,"aws");
	   map.put(4,"gcp");
	   
	   System.out.println(map.size());
	   
        System.out.println("While Loop:");
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key = " + me.getKey() + " Value = " + me.getValue());
        }
        System.out.println("For Loop:");
        for(Map.Entry me2: map.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }
        
        System.out.println("By Java 1.8 feature HashMap Iteration:");
        map.entrySet().iterator()
        .forEachRemaining(System.out::println);

	}
}

