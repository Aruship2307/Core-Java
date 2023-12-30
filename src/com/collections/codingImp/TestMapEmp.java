package com.collections.codingImp;
import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;

class Employee1 {
	int empid;
	String ename;
	String role;
	double sal;
	
	public Employee1(int empid, String ename, String role, double sal) {
		//super();
		this.empid = empid;
		this.ename = ename;
		this.role = role;
		this.sal = sal;
	}
}
public class TestMapEmp {

	public static void main(String[] args) {
		// create object of hashmap by custom object as Employee class 
		
		HashMap<String,Employee1> hm = new HashMap<String,Employee1>();
		
		Employee1 emp1 = new Employee1(21,"Sai","SAP Consultant",35000.00);
		Employee1 emp2 = new Employee1(25,"Rushi","Java Developer",65000.00);
		Employee1 emp3 = new Employee1(29,"Avi","AWS Engineer",95000.00);
		
		hm.put("Santander project", emp1);
		hm.put("UBS project", emp2);
		hm.put("Citi project", emp3);
		
		System.out.println("Employee records for different projects: ");  
		
		 //Traversing map by for each  
	    for(Map.Entry<String, Employee1> entry:hm.entrySet()){    
	        String key=entry.getKey();  
	        Employee1 e=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(e.empid+" "+e.ename+" "+e.role+" "+e.sal);   
	    }    
		
		/*// create an object of Iterator 
		
		Iterator <Entry<String,Employee>> it = hm.entrySet().iterator();
		
		while(it.hasNext()){
			System.out.println("key as project name: "+it.getKey()+" = values Employee data: "+getValues());
		}*/
	}

}
