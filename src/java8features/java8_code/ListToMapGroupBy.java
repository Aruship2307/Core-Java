package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// convert list to map using groupingBy
class Mobile{
	private String name;
	private int Id;
	private String origin;
	
    public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

	@Override
    public String toString() {
        return "Mobile [name=" + name + ", Id=" + Id + ", origin=" + origin + "]";
    }
	
}
public class ListToMapGroupBy {

	public static void main(String[] args) {
		List<Mobile> mobList = new ArrayList<>();
		
		createMobileList(mobList);

		Map<String, List<Mobile>> mobMap = 
				mobList.
				stream()
		.collect(Collectors.groupingBy(Mobile::getOrigin));
		
		// displaying in map Key, Value
		
		mobMap.forEach((key,value)->System.out.println("Origin: "+key+", Mobiles: "+value));
	}
	
	private static void createMobileList(List<Mobile> mobList) {
		Mobile m1 = new Mobile();
		m1.setName("Apple");
		m1.setOrigin("USA");
		m1.setId(1);
		
		Mobile m2 = new Mobile();
		m2.setName("Samsung");
	    m2.setOrigin("South Korea");
	    m2.setId(2);
			
		Mobile m3 = new Mobile();
		m3.setName("OnePlus");
	    m3.setOrigin("China");
	    m3.setId(3);
		
		Mobile m4 = new Mobile();
		m4.setName("POCO");
		m4.setOrigin("China");
		m4.setId(4);
	
		
       mobList.add(m1);
       mobList.add(m2);
       mobList.add(m3);
       mobList.add(m4);
		
		
	}

}
