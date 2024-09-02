package com.java8features;
import java.util.*;

@FunctionalInterface
interface sayable1 {
	String say (String name);
}
public class TestLambda3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(21);
		al.add(23);
		al.add(25);
		al.add(29);
		
		System.out.println("With lambda foreach: ");
		//Java Lambda Expression Example: Foreach Loop
		 
		al.forEach(
		 (n)->System.out.println(n)  
        );
		
		// 
		sayable1 s = (message)-> {
			  String str1 = "I would like to say, ";  
	            String str2 = str1 + message;   
	            return str2;  
		};
		System.out.println(s.say("With lambda foreach:"));

	}

}

/*System.out.println("Without lambda foreach: ");
// withput lambda expression for each
for(Integer n:al) {
	System.out.println(n);
}*/
