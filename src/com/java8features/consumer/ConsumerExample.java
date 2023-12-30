package com.java8features.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	// to code utilise effectively 
    static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student)-> System.out.print(student.getName());
	static Consumer<Student> c4 = (student)-> System.out.println(student.getActivities());

	
	public static void printStudents() {	
		System.out.println("printStudents(): ");
		// Consumer<Student> c2 = (student) -> System.out.println(student);   // to avoid code duplication used on static level
		
		List<Student> studentList = StudentDetails.getAllStudents();
		
		studentList.forEach(c2);
	}
	
	// display name along with activities - BiConsumer , consumer chaining
	
	public static void printNameAndActivities() {

		System.out.println("printNameAndActivities(): ");
		List<Student> studentList = StudentDetails.getAllStudents();
		
		studentList.forEach(c3.andThen(c4));

	}
	
	// display name whose gpa greater than 8 , filtering condition 
	
	public static void printNameAndConditionsConditionsForGrade() {
		System.out.println("printNameAndConditionsConditionsForGrade(): ");
		 
		List<Student> studentList = StudentDetails.getAllStudents();
		
		studentList.forEach((student -> {
			if(student.getGpa()>=9.0) {
				c3.andThen(c4).accept(student);
			}
		}));
	}

	public static void main(String[] args) {
     
	     //consumer implements 
		 Consumer<String> c = (s)-> System.out.println(s.toUpperCase());
	       c.accept("java");
		
	 // printStudents();  // consumer call
	  
	  printNameAndActivities(); // BiConsumer call
	  
	  printNameAndConditionsConditionsForGrade(); // BiConsumer call with some conditions
		
	}

}
