package com.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Dish{
	private String name;
	private boolean veg;
	private int calories;
	public enum Type{MEAT,FISH,OTHER}
	
	

	
    public Dish(String name, boolean veg, int calories, Type type) {
	       this.name = name;
	       this.veg = veg;
	       this.calories = calories;
	    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}

public class StreamByClassDemo {

	public static void main(String[] args) {

		List<Dish> menu = Arrays.asList(
				new Dish("Chicken",false,750,Dish.Type.MEAT),
				new Dish("Paneer",true,690,Dish.Type.OTHER),
				new Dish("Eggs",false,640,Dish.Type.MEAT),
				new Dish("Pizza",true,410,Dish.Type.OTHER),
				new Dish("Mutton",true,790,Dish.Type.MEAT),
				new Dish("Momos",true,460,Dish.Type.OTHER),
				new Dish("Burger",true,380,Dish.Type.OTHER),
				new Dish("Paplet",false,810,Dish.Type.FISH)
				);
		
		// create Predictae for cal <500
		
	//	Predicate<String> calCheck = menu.stream().filter(d->d.getCalories()<500).sorted(Comparator.comparing(Dish::getCalories)).map(Sish::getName)
		
		// return name of dish = where calories less than 500
		System.out.println("Return name of dihs where calories is less than 500: ");
		List<String> lessCalDish = menu
				                      .stream()
				                               .filter(d->d.getCalories()<500)
				                              .sorted(Comparator.comparing(Dish::getCalories))
				                              .map(Dish::getName)
				                                           .collect(Collectors.toList());
		System.out.println(lessCalDish);
		
		// traversing the stream 
		Stream<Dish> s = menu.stream();
		s.forEach(dish -> System.out.println(dish));
		
		List<String> list = List.of("Item 1", "Item 2", "Item 3");
        Stream<String> stream = list.stream();
        stream.forEach(item -> System.out.println(item));
				                             
	}



}
