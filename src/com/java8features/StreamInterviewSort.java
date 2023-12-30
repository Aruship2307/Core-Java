package com.java8features;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	private int id;
	private long salary;
	
	public Employee1(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", salary=" + salary + "]";
	}
	
	
	
}
public class StreamInterviewSort {

	public static void main(String[] args) {

		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1(11, 2500));
		empList.add(new Employee1(12, 2800));
		empList.add(new Employee1(13, 1000));
		empList.add(new Employee1(14, 1500));
		empList.add(new Employee1(15, 3800));
		empList.add(new Employee1(16, 2500));
		empList.add(new Employee1(17, 4500));
		empList.add(new Employee1(18, 5700));
		empList.add(new Employee1(21, 6800));
		empList.add(new Employee1(25, 7500));
		
		List<Employee1> empSortedList =  empList.stream().sorted((obj1,obj2)-> (int)(obj2.getSalary()- obj1.getSalary()))
				.skip(3)  // it skipped 3 top most salaries
				.collect(Collectors.toList()); 
		System.out.println(empSortedList);
	}

}
