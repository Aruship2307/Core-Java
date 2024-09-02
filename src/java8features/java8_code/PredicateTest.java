package com.java8features;
// predicate object with methods like filter, forEach, or removeIf that accept a predicate as an argument

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	
	// for collection 
	public static <T> boolean isNotEmpty(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream().anyMatch(predicate);
	}

	// for array call 
   private static void m1(Predicate<Integer> p1, int[] x) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// checking whether given value greater than 10 
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(100));   // true
		System.out.println(p.test(5));     // false
		
		
		// checking whether given String length is greater than 5
		Predicate<String> s = s1->(s1.length()>5);
		System.out.println(s.test("Avinash"));  // true
		
		
		// checking whether given value is even or not
		Predicate<Integer> a = s2->(s2%2==0);
		System.out.println(a.test(5));  // false
		System.out.println(a.test(8));   // true 
		
		
		//write to check whther given collection is empty or not 
		
		Collection<String> strings = List.of("","");
		Predicate<String> strCheck = (s6) ->s6.isEmpty();
		boolean checkEmpty = isNotEmpty(strings, strCheck);
		System.out.println("Check collection is empty or not: "+checkEmpty);
		
		
		// checking whether given String length is greater than 5
		 Predicate<String> predicate = s3 -> (s3.length() > 0);
         System.out.println(predicate.test("foo"));              // true
         System.out.println(predicate.negate().test("foo"));     // false
         
         
         // over array we're using predicate call
         int[] x = {0, 5, 10, 15, 20, 25, 30}; 
         Predicate<Integer> p1 = i->i>10; 
         Predicate<Integer> p2=i -> i%2==0; 
         System.out.println("The Numbers Greater Than 10:"); 
         m1(p1, x); 
         System.out.println("The Even Numbers Are:"); 
         m1(p2, x); 
         System.out.println("The Numbers Not Greater Than 10:"); 
         m1(p1.negate(), x); 
         System.out.println("The Numbers Greater Than 10 And Even Are:"); 
         m1(p1.and(p2), x); 
         System.out.println("The Numbers Greater Than 10 OR Even:");
         
         
         // removeif() method , removes the empty string from list

         List<String> names = Arrays.asList("sam","tom","smith","gayle","test","sammy");

         Predicate<String> checkEmpty2 = c -> c.isEmpty();
         boolean check = names.removeIf(checkEmpty2);            // it checks whether any string element is empty or not 

         System.out.println("Elements removed: " + check);   

         System.out.println("\nString array after removing empty strings:");
         for (String n : names) {
             System.out.println(n);
         }
         
         
         
         // display names starts with k in String array
         
         String [] name = {"avi","kavita","kane","ben","komal"};
         Predicate<String> st = n1->n1.charAt(0)=='k';
         
         System.out.println("In String array names starts with k:");
         
         for(String n2:name) {
        	 if(st.test(n2)) 
        		 System.out.println(n2);
         }
         
	}	
}
