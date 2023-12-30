package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateUser {
	String name, role;
	PredicateUser(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() {
    	return role;
    	}
    String getName() {
    	return name; 
    	}   
    
    @Override
    public String toString() {
       return "User Name : " + name + ", Role :" + role;
    }
  
    public static void main(String args[])
    {      
        List<PredicateUser> users = new ArrayList<PredicateUser>();
        users.add(new PredicateUser("John", "admin"));
        users.add(new PredicateUser("Peter", "member"));
        List admins = process(users, (PredicateUser u) -> u.getRole().equals("admin"));
        System.out.println(admins);
    }
  
    // below static methods belongs to the class
    public static List<PredicateUser> process(List<PredicateUser> users, 
                            Predicate<PredicateUser> predicate)
    {
        List<PredicateUser> result = new ArrayList<PredicateUser>();
        for (PredicateUser user: users)        
            if (predicate.test(user))            
                result.add(user);
        return result;
    }
}
