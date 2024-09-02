package com.java8features;

import java.util.Optional;

class Employees{
	
	private int id;
	private String name;
	private String email;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	public Employees(int id, String name, String email) {
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	
}
public class OptionalCreateObject {

	public static void main(String[] args) {

		Employees emp = new Employees(1,null,"ru@email.com");
		
		// empty() - to create Optional object
		
		Optional<Object> empOpt = Optional.empty();
		
		System.out.println("first"+empOpt);  // it return Optional.empty
		
		
		// of() - if value = null throw NPE
		
		
		  Optional<String> empOpt2 = Optional.of(emp.getName());
		  
		  System.out.println("second"+empOpt2);
		 
		
		// ofNullable() - comines above 2 methods empty()+of() method 
		// ofNullble() - if value non null return Optional.empty  && if value there 
		
		
		  Optional<String> empOpt3 = Optional.ofNullable(emp.getName());
		  System.out.println(empOpt3);
		  
		  // first approach to handle this exception
		  if (empOpt3.isPresent()) {
	            System.out.println("Name is present: " + empOpt3.get());
	        } else {
	            System.out.println("Name is not present.");
	        }
		  
		  // second approach is like this orElse() method in else block content
		  
		  System.out.println(empOpt3.orElse("Shruti"));  // if value there print value or else print Shruti 
		  
		  // to handle custom exception use orElseThrow()
		  
		  System.out.println(empOpt3.orElseThrow(()-> new IllegalArgumentException("email not present"))); // if value not there print IAE
		 
	}

}
