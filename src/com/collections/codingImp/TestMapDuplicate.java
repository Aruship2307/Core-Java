package com.collections.codingImp;
import java.util.HashMap;
import java.util.Map;

public class TestMapDuplicate {

	public static void main(String[] args) {
	    HashMap<String, String> hm = new HashMap();
	    hm.put("email","ruship86@gmail.com");
	    hm.put("name","avi");
	    hm.put("password","Ben@123");
	    hm.put("name","rushi");     // duplicate key with diff value compiled but at execution time does'nt allow duplicate key
		System.out.println("Map user data: ");
		
		for(Map.Entry m: hm.entrySet()) {
		    		System.out.println(m.getKey()+" : "+m.getValue());

		}
		System.out.println("\n Map updated name data: ");
		hm.put("name","rushi");    //  it replaces the existing value associated with the key "name".
			for(Map.Entry m: hm.entrySet()) {
		    		System.out.println(m.getKey()+" : "+m.getValue());

		}
	}

}
