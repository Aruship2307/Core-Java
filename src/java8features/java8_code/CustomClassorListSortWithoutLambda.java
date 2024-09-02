package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer n1, Integer n2) {
		
		return (n1>n2)?1:(n1<n2)?-1:0;
	}
	
}
/* check later how to sort class by implementing comparator in same way as List
class CustomClassComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		// TODO Auto-generated method stub
		return (e1>e2)?1;(e1<e2)?-1:0;
	}
	
}*/
public class CustomClassorListSortWithoutLambda {

	public static void main(String[] args) {
        
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(24);
		al.add(29);
		al.add(35);
		al.add(8);
		
		System.out.println("Before sort: "+al);
		
		Collections.sort(al, new CustomComparator());
   
		System.out.println("After sort: "+al);
	}

}
