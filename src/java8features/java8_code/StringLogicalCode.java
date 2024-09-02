package com.java8features;

public class StringLogicalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String s = new String("10");
	    int x = Integer.parseInt(s);    // string to int conversion 
		System.out.println(5+8+s+2+5);  // String concatenate example
		System.out.println(5+8+x+2+5);  
				
				
	String str= null;
	System.out.println(str);
	System.out.println(str.valueOf(25)); // value of static method of String class 


    String sb1 ="Ben";
    
    StringBuffer sb = new StringBuffer(sb1);
    
    System.out.println(sb1.equals(sb));
    String convertedString = sb.toString();
   System.out.println(s.equals(convertedString));

	String s1 = "ben";
	String s2 = new String("ben");
	// below is regular approach to check equality 
	if(s1==s2)
	System.out.println("s1 and s2 are equal");
	else
	System.out.println("s1 and s2 are not equal");
    
    // by using intern() method converting object 
    s2=s2.intern();  // to convert heap obj to string pool object , refer same data 
    
    if(s1==s2)
	System.out.println("s1 and s2 are equal");
	else
	System.out.println("s1 and s2 are not equal");

	}

}
