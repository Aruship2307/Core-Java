package com.faq.imp.program;
import java.util.*;

public class Carrlistretain {
	
           public static void main (String arg [] ) {
            
        	   ArrayList<String> al = new ArrayList<String>();
        	   al.add("avi");
        	   al.add("bro");
        	   al.add("catch");
               
        	   ArrayList<String> al2 = new ArrayList<String>();
        	   al2.add("pune");
        	   al2.add("avi");
        	   al.retainAll(al2);
        	   System.out.println("Iterating the elements after retaining the elements of al2..");

        	   Iterator <String> itr = al.iterator();
        	   while(itr.hasNext()) {
        	   System.out.println(itr.next());
        	   }
       }
}