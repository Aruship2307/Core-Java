package com.collections.codingImp;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
        
		ArrayList<Integer> al = new ArrayList<>();
		al.add(27);
		al.add(23);
		al.add(25);
		al.add(27);
		al.add(23);
		al.add(28);
		al.add(29);
		al.add(23);
		al.add(35);
		al.add(38);
		al.add(48);
		al.add(48);
		// isEmpty() checking elements present in AL
		System.out.println("check AL has elements or not: "+al.isEmpty());
		
	   // get(int index) - return element at position
		System.out.println("check elements at specific position: "+al.get(5));
		
		// boolean contains(Object o) -- check as per elements in AL
		System.out.println("check elements at specific position: "+al.contains(35));
		
		// return index as per elements of occurance in the list 
		System.out.println("it return index in list the first occurrence of specified element AL: "+al.indexOf(23));
		System.out.println("it return index in list the first occurrence of specified element AL: "+al.indexOf(48));
		
		System.out.println("it return index of last element in AL: "+al.lastIndexOf(23));
		System.out.println("it return index of last element in AL: "+al.lastIndexOf(48));
		
		Collections.sort(al);
		System.out.println("sorted AL: "+al);
		// using for loop 
		System.out.println("using for each loop");
		for(Integer it : al) {
			System.out.println(it);
		}
	
		// create object of Iterator and iterate arraylist
		System.out.println("Performing next and remove operation on given set:");
		Iterator<Integer> it = al.iterator();
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println(al);
		
		// check element in arraylist
		/*al.contains(38);
		  if(.contains(38)){
			  return true;
		  }else {
			  return false;
		  }*/
		
		// 	using Iterator interface 	
		System.out.println("using  Iterator interface ");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		LinkedList<Integer> lt = new LinkedList<Integer>();
		
		lt.add(71);
		lt.add(72);
		lt.add(73);
		lt.add(74);
		
		// linked list appened at the the end of ArrayList
		al.addAll(lt);
		
		System.out.println("LL appended at the end of AL: "+al);
		
		al.clone();
		
		System.out.println("By clone method: "+al);
	}

}
