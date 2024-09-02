package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp1 {
	private int sal;
	private String Department;
	public Emp1(int sal, String department) {
		super();
		this.sal = sal;
		Department = department;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
}
public class FindMaxSalFromEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp1> emp = Arrays.asList(new Emp1(25,"IT"), new Emp1(92,"ACCOUNT"), new Emp1(23,"IT"),
				                      new Emp1(81,"HR"),new Emp1(21,"HR"),new Emp1(68,"ACCOUNT"));
		
		Map<String, Object> maxSalByDept = emp.stream()
		                                  .collect(Collectors.groupingBy(Emp1::getDepartment, 
		                                		   Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Emp1::getSal)),
		                                                   empOptional -> empOptional.map(Emp1::getSal).orElse(0)
		                                				   )
		                                		   ));
		maxSalByDept.forEach((dept, maxSal)->{
			System.out.println("Department: "+dept +" ,Maximum salary: "+maxSal);
			
		});
	
	}

}
