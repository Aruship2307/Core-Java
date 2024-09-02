package com.java8features.consumer;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private double gpa;
	private String gender;
	List<String> activities = new ArrayList<>();

	public List<String> getActivities (){
		return activities;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

	public Student(String name, double gpa, String gender, List<String> activities) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.gender = gender;
		this.activities = activities;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", gender=" + gender + ", activities=" + activities
				+ ", getName()=" + getName() + ", getGpa()=" + getGpa() + ", getGender()=" + getGender()
				+ ", getActivities()=" + getActivities() + "]";
	}
	
}
