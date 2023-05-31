package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

class Ipl {
	String name;
	String team;
	int number;
	
	public Ipl(String name, String team, int number) {
		super();
		this.name = name;
		this.team = team;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Ipl [name=" + name + ", team=" + team + ", number=" + number + "]";
	}
	
}
public class TestLambdaCustomClass {

	public static void main(String[] args) {
		
	ArrayList<Ipl> al = new ArrayList<Ipl>();
     al.add(new Ipl("Virat","RCB",18));
     al.add(new Ipl("Rohit","MI",45));
     al.add(new Ipl("Dhoni","CSK",07));
     
     System.out.println("Before sorting: ");
     System.out.println(al);
    
     // descending order sort for custom class
     Collections.sort(al,(obj1,obj2)->(obj1.number>obj2.number)?-1:(obj1.number<obj2.number)?+1:0);
     
     System.out.println("After sorting: ");
     System.out.println(al);
	}

}
