package com.java8features;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

// How to filter list of employees based on their salaries using stream API & without using Stream API

 enum Gender {
	Male,Female;
}
class Employee {
	private long empId;
	private String empName;
	private long salary;
	private Gender gender;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	

}
public class StreamFilter {

	public static void main(String[] args) {

      // creating objects of Employee class 
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		
		// intialized four employee objects 
		emp1.setEmpId(121);
		emp1.setEmpName("Sai");
		emp1.setSalary(10000);
		emp1.setGender(Gender.Male);
		
		emp2.setEmpId(122);
		emp2.setEmpName("Ravi");
		emp2.setSalary(12000);
		emp2.setGender(Gender.Male);
		
		emp3.setEmpId(123);
		emp3.setEmpName("Aish");
		emp3.setSalary(18000);
		emp3.setGender(Gender.Female);
		
		emp4.setEmpId(124);
		emp4.setEmpName("Kajol");
		emp4.setSalary(15000);
		emp4.setGender(Gender.Female);
		
		// add this data list 
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		// want employee who is drawing more than 10000
		//getting stream object, filtering data(based on condn is if salary is greater than 10K, 
		//then collecting filtered data into list
		
		List<Employee> list = empList.stream().filter(e->e.getSalary()>10000).collect(Collectors.toList());
 
		System.out.println(list);
		
		// want list of salaries who is drawing more than 10000
		
		// using list getting stream object, using filter (salary basis condn), passing to map, list of sal passing ,
		  //extracting, to collect the salary assigning to list
		
		
		List<Long> salList = empList.stream().
				            filter(e->e.getSalary()>10000).map(e->e.getSalary()).collect(Collectors.toList());
		
		System.out.println();

		System.out.println(salList);

		
	}

}

/*
 * without stream same above code replaced
 * Iterator itr = empList.iterator()
 * List<Long> salList = new ArrayList<Long>();
 * 
 * while(itr.hasNext()){
 * Employee emp = (Employee)itr.next();
 * if(emp.getSalary()>10000) {
 * salList.add(emp.getSalary());
 * }
 * }
 * System.out.println(salList);
 * 
 * */
