package code_test;

import java.util.Comparator;
import java.util.PriorityQueue;

// creating Employee class with data
class Employee{
	int empId;
	String empName;
	int salary;
	String email;
	Employee(int empId, String empName,int salary, String email){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.email=email;
	}
}
// creating empIdCompare class to compare two objects 
class Empcompar implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary==e2.salary)
			return  0;
		else if(e1.salary!=e2.salary)
			return 1;
		else
			return -1;
	}
}
public class PQComTest {

	public static void main(String[] args) {
		
	PriorityQueue<Employee> pq1 = new PriorityQueue<Employee>(250,new Empcompar());
   pq1.add(new Employee(101,"Ben",2500,"ben12"));
   pq1.add(new Employee(102,"Virat",3500,"vk18"));
   pq1.add(new Employee(103,"Mbape",1800,"mb17"));
   pq1.add(new Employee(104,"sky",3000,"sk28"));
   
   System.out.println("Comparison between two employee:");
   
   for(Employee str:pq1) {
	   System.out.println("Salary"+str.salary);
   }
	
	}

}
