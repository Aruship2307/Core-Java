package com.collections.codingImp;
import java.util.List;
import java.util.LinkedList;


class Vehicle {
	String price, modelNum, name;
	double rating;
	
	Vehicle(String price, String modelNum, String name, double rating) {
		this.price=price;
		this.modelNum=modelNum;
		this.name=name;
		this.rating=rating;
	}
}

public class LLVehicledata {

	public static void main(String[] args) {
		//creating list for vehicle class
		List<Vehicle> ll = new LinkedList <>();
		
		// creating various objects for list
		Vehicle v1 = new Vehicle("2.5Cr","m20","Mercedez",9.8);
		Vehicle v2 = new Vehicle("4.2Cr","B80x","BMW",9.9);
		Vehicle v3 = new Vehicle("2.5Cr","T10y","TOYOTA",8.7);
		Vehicle v4 = new Vehicle ("1.8Cr","TG150","TATA",8.4);
		
		// adding list to Vehicle class
		
		ll.add(v1);
		ll.add(v2);
		ll.add(v3);
		ll.add(v4);
		
		// traversing the list 
		
		for (Vehicle v: ll) {
			System.out.println("Features of Vehicle: "+v.price+", "+v1.modelNum+", "+v.name+", "+v.rating);
		}

	}

}
