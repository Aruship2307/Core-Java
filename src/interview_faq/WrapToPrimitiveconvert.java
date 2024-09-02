package com.faq.imp.program;

public class WrapToPrimitiveconvert {
       public static void main (String arg [] ) {
    	   
	   int a=20;
	   Integer i = Integer.valueOf(a); //converting int to Integer class of object
	   Integer j =a; //auto-boxing compiler will write Integer.valueOf implicitally or internally
	   System.out.println("auto-boxing: int(primitive) to Integer wrapper object.");
	   System.out.println(a+" "+i+" "+j);
	   
	   // converting object value into primirtive datatype
       Integer k = new Integer (45);
       int l = k.intValue();  
       int m = k; // unboxing ..implicitally allocation 
	   System.out.println("\nauto-Unboxing: Integer wrapper object to int(primitive).");
       System.out.println(k+" "+l+" "+m);
	   
	   char c='A';
	   Character ch = Character.valueOf(c);
	   Character ch1 = c;
	   System.out.println("\nauto-boxing: char(primitive) to Character wrapper object.");

	   System.out.println(c+" "+ch+" "+ch1);

                
	   }}