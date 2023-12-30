package com.collections.codingImp;
import java.util.HashMap;
import java.util.Map;

public class Map8New {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		  
		  map.put("Effective Java", "Kathy Sierra");
		  map.put("Spring in Action", "Craig Walls");
		  map.put("Hibernate in Action", "Gavin King");
		  map.put("Pro Angular", "Freeman");
		  map.put("Pro Spring Boot", "Felipe Gutierrez");
		  
		  // only modify code if key already exists in map=update values 
		  
		  map.computeIfPresent("Spring in Action", (key,value)-> "Aish Jorve");
		  
		  //only modify if key doesn't exists in map 
		  
		  map.computeIfAbsent("AWS Cloud", (value)->"GCP Cloud");
		  
		  // iterate and print the values 
		  
		  map.entrySet().
		  iterator()
		  .forEachRemaining(System.out::println);
	}

}
