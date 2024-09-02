package com.java8features.consumer;

import java.util.Arrays;
import java.util.List;

public class StudentDetails {
	
	public static List<Student> getAllStudents(){
		// students above 9.0 cgpa
		Student student1 = new Student("Saurabh",9.5,"male", Arrays.asList("Reading", "speaking"));
		Student student2 = new Student("Dikshant",9.3,"male",Arrays.asList("taveling","painting"));
		
		// students above 8.0 cgpa
		Student student3 = new Student("Sachin",8.9,"male", Arrays.asList("politics", "business"));
		Student student4 = new Student("Mayuri",8.3,"female", Arrays.asList("cooking", "singing"));

		// students above 7.5 cgpa
		Student student5 = new Student("Shruti",9.8,"female", Arrays.asList("singing", "speaking"));
		Student student6 = new Student("Pavan",7.9,"male", Arrays.asList("cooking", "traveling"));

		
		List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
		return students;
		
	}

}
