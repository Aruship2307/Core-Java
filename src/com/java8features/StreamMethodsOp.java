package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class StreamMethodsOp {

	public static void main(String[] args) {

// second way to create list 
	//List<Integer> list = List.of(45,89,76); 
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(87);
		list.add(71);
		list.add(84);
		list.add(92);
		
		System.out.println(list);
		
		//without stream check odd even 
		
		List<Integer> storeList = new ArrayList<Integer>();
		
		for(Integer intr : list){
			if(intr%2 ==0){
			storeList.add(intr);
			}
		}
		
		System.out.println(storeList);
		
		
		// with strem even odd check 
		Stream<Integer> stream = list.stream();
		
		List<Integer>  newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		
	}

}
