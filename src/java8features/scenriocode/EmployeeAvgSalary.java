package com.java8features.scenriocode;

import java.util.Arrays;
import java.util.List;

public class EmployeeAvgSalary {

	private int empId;
	private String ename;
	private Double sal;
	private int age;
	

	public EmployeeAvgSalary(int empId, String ename, Double i, int a) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = i;
		this.age = a;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
   public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public static void main(String[] args) {

		List<EmployeeAvgSalary> list = Arrays.asList(new EmployeeAvgSalary(121,"Dikshant",25000.00, 31), 
				new EmployeeAvgSalary(122,"Krishna",22000.00,34),
				new EmployeeAvgSalary(123,"Mrunal",19000.00,23));
		
		double avgSal = list.stream().filter(s->s.getAge()>30).mapToDouble(s->s.getSal()).average().orElse(0.0);
		
		System.out.println("Average salary of Employee whose age is greater than 30: "+avgSal);
	}

}
