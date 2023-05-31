package com.java8features;
import java.util.function.*;
import java.util.*;
class City {
	 String name;
     String code;
     String cityFamous;
   
	 City(String name, String code, String cityFamous) {
		this.name = name;
		this.code = code;
		this.cityFamous = cityFamous;
	}
}
public class TestConsuerFunctn {

	public static void main(String[] args) {
       ArrayList<City> al = new ArrayList<City>();
       
       populate(al);
       Consumer<City> c = c1 -> {
    	   System.out.println("City Name:"+c1.name);
    	   System.out.println("City Code: "+c1.code);
    	   System.out.println("City Favourite: "+c1.cityFamous);
    	   System.out.println();
       };
       
       for(City c1:al){
    	   c.accept(c1);
       }
	}
       public static void populate(ArrayList<City> al) {
   		al.add(new City ("Pune","MH12","Puneri-Misal"));
   		al.add(new City("Mumbai","MH01","Jumbo-Wadapav"));
   		al.add(new City("Kolhapur","MH17","Kolhapuri Sabji"));
   	}
}
