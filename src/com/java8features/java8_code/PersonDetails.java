package com.java8features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

class Person {
	private String surName;
	private int age;
	private String gender;
	
	public Person(String sur) {
	    surName = sur;
		age = 29;
		gender = "Male";
	}
	
	public void printName() {
		System.out.println(surName);
	}
	
	public String customFunction(Function<Person, String> f) {
		return f.apply(this);
	}
	
	public static List<Person> createShortList(){
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Dikshant"));
		people.add(new Person("Sachin"));
	    people.add(new Person("Vaibhav"));
	    people.add(new Person("Pavan"));
		
		return people;
	}

	public String getSurName() {
		return surName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}
}

// searchcriteria for second scenarios program, combines this 3 codes 

class SearchCriteria {
	private final Map<String, Predicate<Person>> searchMap = new HashMap<>();
	
	private SearchCriteria(){
		super();
		initSearchMap();
	}
	
	private void initSearchMap(){
		Predicate<Person> allDrivers = p->p.getAge()>=16;
		Predicate<Person> allDraftees = p->p.getAge()>=17 && p.getAge()<=25;
		Predicate<Person> allPilots = p-> p.getAge()>=18 && p.getAge()<=65;
		
		searchMap.put("allDrivers", allDrivers);
		searchMap.put("allDraftees", allDraftees);
		searchMap.put("allPilots", allPilots);
		
	}
	
	public Predicate<Person>  getCriteria(String PredicateName){
		Predicate<Person> target;
		
		target = searchMap.get(PredicateName);
		
		if(target==null) {
			System.out.println("Search criteria not found...");
			System.exit(1); 
		}
		return target;
	}
	
	public static SearchCriteria getInstance() {
		return new SearchCriteria();
	}
}

public class PersonDetails {

	public static void main(String[] args) {

		System.out.println("- - - Name test new: - - - ");
		
		List<Person> list1 = Person.createShortList();
		
		// define south and north lambda call 
		
		Function<Person, String> southStyle = p -> "\nName1: " + " " + p.getSurName() + "\n";
		
		Function<Person, String> northStyle = p-> "\nName2: " + " " + p.getSurName() + "\n";
		
		
		// print southStyle name by 2 ways java 1.8 featues & simple for each loop
		System.out.println("\n Display south styles names: ");
		list1.stream().map(southStyle).forEach(a->System.out.println(a));
		
		//list1.stream().map(x->x.getSurName()).forEach(a->System.out.println(a));   map takes as argument Function Interface 
		
		/*for(Person person : list1) {
			System.out.println(person.customFunction(southStyle));
		}*/
		
		
		
		// print northStyle name
		
		System.out.println("\n Display norht styles names: ");
		list1.stream().map(northStyle).forEach(a->System.out.println(a));
		
		
		/*for(Person person : list1) {
			System.out.println(person.customFunction(northStyle));
		}*/
		
		
		// for SearchCriteria class invocations in main methods
		
		SearchCriteria search = SearchCriteria.getInstance();
		
		System.out.println("South pilot phone list: ");  // Person() constructor age 18 to 65 defined values
		
		list1.stream().filter(search.getCriteria("allPilots")).forEach(p->p.printName());  
		
		System.out.println("North Draftees phone list: ");  // Person() constructor age 17 to 25 defined values 
		
		list1.stream().filter(search.getCriteria("allDraftees")).forEach(p->p.printName());
	}

}
