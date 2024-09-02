package com.java8features;

// single parameter or multi parameter

//@FunctionalInterface
interface Addable {
	public int add(int a, int b);
	
}
public class TestLambda2  {

	public static void main(String[] args) {
		
		 // Multiple parameters in lambda expression  -- without return type 
		Addable c = (a,b) -> (a+b);
		System.out.println(c.add(20, 5));
		
		
		// Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println("Multiple parameter in lambda"+ad2.add(100,200));     
        
	}

}

/* public String say(String name);   <-- inside FI abstract method 
 * 
 * // Lambda expression with single parameter.  
Sayable s1=(name)->{  
    return "Hello, "+name;  
};  
System.out.println(s1.say("Sonoo"));  
  
// You can omit function parentheses    
Sayable s2= name ->{  
    return "Hello, "+name;  
};  
System.out.println(s2.say("Sonoo"));  */
