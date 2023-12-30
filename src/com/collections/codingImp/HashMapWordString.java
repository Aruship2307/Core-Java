package com.collections.codingImp;
import java.util.*;

public class HashMapWordString {

	public static void main(String[] args) {

		String str = "I am fullstack Java developer In Pune";
		
		String [] split = str.split(" ");  // split with 1 space
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(int i=0;i<split.length;i++) {
			if(hm.containsKey(split[i])) {
				int count = hm.get(split[i]);
				hm.put(split[i], count+1);
			}else {
				hm.put(split[i], 1);
			}
		}
		System.out.println(hm);
	}

}
