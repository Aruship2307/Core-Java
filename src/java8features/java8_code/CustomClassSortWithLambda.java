package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

class Emp {
	int empNo;
	String empName;
	
	public Emp(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	@Override
	public String toString() {
		
		return empNo+" "+empName;
	}
	
	
}

public class CustomClassSortWithLambda {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<Emp>();
         list.add(new Emp(27,"pavan"));
         list.add(new Emp(24,"vaibhav"));
         list.add(new Emp(26,"Avinash"));
         list.add(new Emp(16,"sai"));
         list.add(new Emp(21,"dikshant"));
         list.add(new Emp(19,"shruti"));
         
         System.out.println("before: "+list);
         
         // sorty by lambda exp
         
         Collections.sort(list, (e1, e2) -> (e1.empNo > e2.empNo) ? -1 : (e1.empNo < e2.empNo) ? 1 : 0);
         
         System.out.println("After: "+list);
         
         
        
         
         
	}

}
